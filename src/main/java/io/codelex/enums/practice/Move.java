package io.codelex.enums.practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public enum Move {


    STONE,
    PAPER,
    SCISSORS;

    private static final List<Move> VALUES = List.of(values());
    private static final int SIZE = VALUES.size();
    private static final Random RANDOM = new Random();

    public static Move getRandomMove() {
        return VALUES.get(RANDOM.nextInt(SIZE));
    }
}
