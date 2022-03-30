package io.codelex.polymorphism.practice.exercise6;

public abstract class Mammal extends Animal {

    private String region;

    public Mammal(String type, String name, double weight, String region) {
        super(name, type, weight);
        this.region = region;
    }

    public String getRegion() {
        return region;
    }
}
