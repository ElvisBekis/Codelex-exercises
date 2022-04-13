package io.codelex.collections.practice.phonebook;

public class Main {
    public static void main(String[] args) {
        PhoneEntry entry1 = new PhoneEntry("John", "1231239");
        PhoneDirectory directory = new PhoneDirectory();
        directory.putNumber(entry1);
        System.out.println(directory.getNumber("John"));
    }
}
