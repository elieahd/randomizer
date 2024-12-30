package com.devt.randomizer.randomizers.fields.numbers;

import com.devt.randomizer.randomizers.Randomizer;

import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

public class FloatRandomizer implements Randomizer<Float> {

    private final float min;
    private final float max;

    public FloatRandomizer(float min, float max) {
        if (min > max) {
            throw new IllegalArgumentException(
                    "Float randomizer failed initializing, because min '%s' should be less than or equal to max '%s'"
                            .formatted(min, max)
            );
        }
        this.min = min;
        this.max = max;
    }

    @Override
    public Float next() {
        if (Objects.equals(min, max)) {
            return min;
        }
        return min + ThreadLocalRandom.current().nextFloat() * (max - min);
    }

}
