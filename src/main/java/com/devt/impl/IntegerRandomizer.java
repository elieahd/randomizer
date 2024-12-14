package com.devt.impl;

import java.util.Random;

public class IntegerRandomizer {

    private final Random random;

    public IntegerRandomizer(Random random) {
        this.random = random;
    }

    public Integer next(int min, int max) {
        if (min > max) {
            throw new IllegalArgumentException(
                    "Randomizing an integer between failed, because min '%s' should be greater than max '%s'"
                            .formatted(min, max)
            );
        }
        if (min == max) {
            return min;
        }
        return random.nextInt(max - min) + min;
    }

}
