package io.codelex.polymorphism.practice.exercise3;

public class Student extends Person {

    private double gpa;

    public Student(double gpa) {
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public void display() {
        System.out.println("First name: " + super.getFirstName() + " lastname: " + super.getLastName() + " address: " + super.getAddress()
                + " ID: " + super.getId() + " GPA: " + getGpa() + ".");
    }
}
