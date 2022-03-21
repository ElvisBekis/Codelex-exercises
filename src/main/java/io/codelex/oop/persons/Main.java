package io.codelex.oop.persons;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Employee e1 = new Employee("John", "Brown", "123456", 50, "Accountant", LocalDate.of(2000, 12, 10));
        System.out.println(e1.getInfo());
        System.out.println();

        Customer c1 = new Customer("Peter", "Brown", "123457", 60, "CID1234", 0);
        c1.setPurchaseCount(10);
        System.out.println(c1.getInfo());

    }
}
