package com.devt.randomizer.randomizers.fields.numbers;

import com.devt.randomizer.randomizers.Randomizer;

import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

public class DoubleRandomizer implements Randomizer<Double> {

    private final Double min;
    private final Double max;

    public DoubleRandomizer(double min, double max) {
        if (min > max) {
            throw new IllegalArgumentException(
                    "Double randomizer failed initializing, because min '%s' should be less than or equal to max '%s'"
                            .formatted(min, max)
            );
        }
        this.min = min;
        this.max = max;
    }

    @Override
    public Double next() {
        if (Objects.equals(min, max)) {
            return min;
        }
        return min + (ThreadLocalRandom.current().nextDouble() * (max - min));
    }

}
