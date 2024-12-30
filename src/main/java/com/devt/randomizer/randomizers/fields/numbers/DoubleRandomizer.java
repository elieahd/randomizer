package com.devt.randomizer.randomizers.fields.numbers;

import com.devt.randomizer.randomizers.Randomizer;

import java.util.Objects;
import java.util.Random;

public class DoubleRandomizer implements Randomizer<Double> {

    private final Random random;
    private final Double min;
    private final Double max;

    public DoubleRandomizer(Random random, double min, double max) {
        if (min > max) {
            throw new IllegalArgumentException(
                    "Double randomizer failed initializing, because min '%s' should be less than or equal to max '%s'"
                            .formatted(min, max)
            );
        }
        this.random = random;
        this.min = min;
        this.max = max;
    }

    @Override
    public Double next() {
        if (Objects.equals(min, max)) {
            return min;
        }
        return min + (random.nextDouble() * (max - min));
    }

}
