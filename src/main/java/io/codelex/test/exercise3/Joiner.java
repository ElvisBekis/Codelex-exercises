package io.codelex.test.exercise3;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Joiner<T> {

    private final String separator;

    public Joiner(String separator) {
        this.separator = separator;
    }

    public String join(T... args) {
        return Arrays.stream(args).map(T::toString).collect(Collectors.joining(separator));
    }

}
