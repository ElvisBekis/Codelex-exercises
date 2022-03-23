package io.codelex.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class tddTest {

    @Test
    void testFirstNumber() {
        tdd sequence = new tdd();
        int firstNumberToGet = 1;
        int secondNumberToGet = 2;
        int thirdNumberToGet = 3;
        int fourthNumberToGet = 5;

        int expectedFirst = 0;
        int expectedSecond = 1;
        int expectedThird = 1;
        int expectedFourth = 3;
        Assertions.assertEquals(expectedFirst, tdd.getNumber(firstNumberToGet));
        Assertions.assertEquals(expectedSecond, tdd.getNumber(secondNumberToGet));
        Assertions.assertEquals(expectedThird, tdd.getNumber(thirdNumberToGet));
        Assertions.assertEquals(expectedFourth, tdd.getNumber(fourthNumberToGet));

    }

    @Test
    void testLaterNumbers() {
        tdd sequence = new tdd();

        Assertions.assertEquals(55, tdd.getNumber(11));
        Assertions.assertEquals(89, tdd.getNumber(12));
        Assertions.assertEquals(144, tdd.getNumber(13));
    }

    @Test
    void testIncorrectIndex() {
        tdd sequence = new tdd();
        Exception e = Assertions.assertThrows(IllegalArgumentException.class, () -> tdd.getNumber(-3));
        Assertions.assertEquals("Incorrect index!!!", e.getMessage());
    }
}
