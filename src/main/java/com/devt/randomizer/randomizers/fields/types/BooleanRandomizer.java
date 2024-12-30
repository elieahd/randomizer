package com.devt.randomizer.randomizers.fields.types;

import com.devt.randomizer.randomizers.Randomizer;

import java.util.Random;

public class BooleanRandomizer implements Randomizer<Boolean> {

    private final Random random;

    public BooleanRandomizer(Random random) {
        this.random = random;
    }

    @Override
    public Boolean next() {
        return random.nextBoolean();
    }

}
