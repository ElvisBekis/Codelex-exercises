package io.codelex;

public class Bottle<T extends Liquid> {
    private final T contents;

    public Bottle(T contents) {
        this.contents = contents;
    }

    void pourOutContents() {
        System.out.println(contents + " has been poured out!");
    }


}
