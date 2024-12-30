package com.devt.randomizer.randomizers.fields.numbers;

import com.devt.randomizer.randomizers.Randomizer;

import java.util.Objects;
import java.util.Random;

public class IntegerRandomizer implements Randomizer<Integer> {

    private final Random random;
    private final Integer min;
    private final Integer max;

    public IntegerRandomizer(Random random, int min, int max) {
        if (min > max) {
            throw new IllegalArgumentException(
                    "Integer randomizer failed initializing, because min '%s' should be less than or equal to max '%s'"
                            .formatted(min, max)
            );
        }
        this.random = random;
        this.min = min;
        this.max = max;
    }

    @Override
    public Integer next() {
        if (Objects.equals(min, max)) {
            return min;
        }
        return random.nextInt(max - min) + min;
    }

}
