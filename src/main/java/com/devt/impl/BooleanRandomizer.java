package com.devt.impl;

import java.util.Random;

public class BooleanRandomizer {

    private final Random random;

    public BooleanRandomizer(Random random) {
        this.random = random;
    }

    public Boolean next() {
        return random.nextBoolean();
    }

}
