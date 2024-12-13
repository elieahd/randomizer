package com.devt.impl;

import java.util.Random;

public class DoubleRandomizer {

    private final Random random;

    public DoubleRandomizer(Random random) {
        this.random = random;
    }

    public Double next(double min, double max) {
        return min + (random.nextDouble() * (max - min));
    }

}
