package com.devt.randomizer.randomizers.fields.types;

import com.devt.randomizer.randomizers.Randomizer;

import java.util.concurrent.ThreadLocalRandom;

public class BooleanRandomizer implements Randomizer<Boolean> {

    @Override
    public Boolean next() {
        return ThreadLocalRandom.current().nextBoolean();
    }

}
