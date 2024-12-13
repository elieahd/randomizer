package com.devt.impl;

import java.util.Random;

public class IntegerRandomizer {

    private final Random random;

    public IntegerRandomizer(Random random) {
        this.random = random;
    }

    public Integer next(int min, int max) {
        return random.nextInt(max - min) + min;
    }

}
