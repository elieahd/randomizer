package com.devt.randomizer.randomizers.fields.numbers;

import com.devt.randomizer.randomizers.Randomizer;

import java.util.Objects;
import java.util.Random;

public class FloatRandomizer implements Randomizer<Float> {

    private final Random random;
    private final float min;
    private final float max;

    public FloatRandomizer(Random random, float min, float max) {
        if (min > max) {
            throw new IllegalArgumentException(
                    "Float randomizer failed initializing, because min '%s' should be less than or equal to max '%s'"
                            .formatted(min, max)
            );
        }
        this.random = random;
        this.min = min;
        this.max = max;
    }

    @Override
    public Float next() {
        if (Objects.equals(min, max)) {
            return min;
        }
        return min + random.nextFloat() * (max - min);
    }

}
