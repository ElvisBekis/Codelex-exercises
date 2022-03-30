package io.codelex.polymorphism.practice.exercise3;

public class Main {
    public static void main(String[] args) {

        Student student = new Student(12.34);
        student.setFirstName("John");
        student.setLastName("Wick");
        student.setAddress("Somewhere");
        student.setId(1);
        student.display();
        Employee employee = new Employee("Gardener");
        employee.setFirstName("Mike");
        employee.setLastName("Ross");
        employee.setAddress("Somewhere else");
        employee.setId(2);
        employee.display();
    }
}
