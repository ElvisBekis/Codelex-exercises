package io.codelex.arithmetic.exercises;

public class Ex_8 {

    static final double minimumWage = 8.0;
    static final int maxHours = 60;

    public static void main(String[] args) {

        int[] nr = new int[3];
        nr[0] = 1;
        nr[1] = 2;
        nr[2] = 3;
        double[] baseRate = new double[3];
        baseRate[0] = 7.50;
        baseRate[1] = 8.20;
        baseRate[2] = 10.00;
        int[] hours = new int[3];
        hours[0] = 35;
        hours[1] = 47;
        hours[2] = 73;

        double totalSalary;

        for (int i = 0; i < nr.length; i++)

            if (baseRate[i] < minimumWage || maxHours < hours[i]) {
                System.out.println("Error!");
            } else {
                if (hours[i] > 40) {
                    totalSalary = baseRate[i] * hours[i] + 1.5 * (hours[i] - 40);
                } else {
                    totalSalary = baseRate[i] * hours[i];
                }
                System.out.println("Employee " + nr[i] + " total salary is " + totalSalary);
            }
    }
}
