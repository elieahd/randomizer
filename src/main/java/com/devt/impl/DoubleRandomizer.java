package com.devt.impl;

import java.util.Random;

public class DoubleRandomizer {

    private final Random random;

    public DoubleRandomizer(Random random) {
        this.random = random;
    }

    public Double next(double min, double max) {
        if (min > max) {
            throw new IllegalArgumentException(
                    "Randomizing a double between failed, because min '%s' should be greater than max '%s'"
                            .formatted(min, max)
            );
        }
        return min + (random.nextDouble() * (max - min));
    }

}
