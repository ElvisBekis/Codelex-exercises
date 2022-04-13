package io.codelex.test;

import io.codelex.test.exercise3.Joiner;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JoinerTest {

    @Test
    public void joinTest() {
        int x = 1;
        int y = 2;
        int z = 3;
        Joiner<Integer> joiner = new Joiner<>("+");
        String joinedInts = joiner.join(1, 2, 3);
        Assertions.assertEquals(joinedInts, "1+2+3");
    }

}
