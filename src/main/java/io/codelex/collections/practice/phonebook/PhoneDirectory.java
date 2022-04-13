package io.codelex.collections.practice.phonebook;

import java.util.TreeMap;

public class PhoneDirectory {
    private final TreeMap<String, String> data;

    public PhoneDirectory() {
        data = new TreeMap<>();
    }

    public String getNumber(String name) {
        return data.get(name);
    }

    public void putNumber(PhoneEntry entry) {
        if (entry.name == null || entry.number == null) {
            throw new IllegalArgumentException("Name and number cannot be null;");
        } else {
            data.put(entry.name, entry.number);
        }
    }


    @Override
    public String toString() {
        return "PhoneDirectory{" +
                "data=" + data +
                '}';
    }
}