package io.codelex.oop.runners;

public enum Runner {

    BEGINNER(297, 250),
    INTERMEDIATE(250, 188),
    ADVANCED(188, 121),
    LIAR(120, 0),
    TRAIN_MORE(10000, 297);

    private final int max;
    private final int min;

    Runner(int max, int min) {
        this.max = max;
        this.min = min;
    }

    public static Runner getFitnessLevel(int time) {
        if (time <= BEGINNER.max && time >= BEGINNER.min) {
            return BEGINNER;
        } else if (time < INTERMEDIATE.max && time > INTERMEDIATE.min) {
            return INTERMEDIATE;
        } else if (time <= ADVANCED.max && time >= ADVANCED.min) {
            return ADVANCED;
        } else if (time < LIAR.max) {
            return LIAR;
        } else {
            return TRAIN_MORE;
        }
    }
}
