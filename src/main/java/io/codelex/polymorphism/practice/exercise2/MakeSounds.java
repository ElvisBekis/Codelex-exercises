package io.codelex.polymorphism.practice.exercise2;

import java.util.ArrayList;
import java.util.List;

public class MakeSounds {
    public static void main(String[] arg) {
        List<Sound> sounds = new ArrayList<>();
        Parrot parrot = new Parrot();
        Radio radio = new Radio();
        Firework firework = new Firework();
        sounds.add(parrot);
        sounds.add(radio);
        sounds.add(firework);
        sounds.forEach(Sound::playSound);
    }
}
