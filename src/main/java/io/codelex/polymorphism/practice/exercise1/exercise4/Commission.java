package io.codelex.polymorphism.practice.exercise1.exercise4;

public class Commission extends Hourly {

    private double totalSales;
    private double commissionRate;

    public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double commissionRate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        this.commissionRate = commissionRate;
    }

    public void addSales(double sale) {
        totalSales += sale;
    }

    @Override
    public double pay() {
        double payment = super.pay() + commissionRate * totalSales;
        totalSales = 0;
        return payment;
    }


    @Override
    public String toString() {
        return super.toString() + " Commission{" +
                "totalSales=" + totalSales +
                "} ";
    }
}
