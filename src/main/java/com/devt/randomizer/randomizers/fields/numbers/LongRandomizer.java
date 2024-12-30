package com.devt.randomizer.randomizers.fields.numbers;

import com.devt.randomizer.randomizers.Randomizer;

import java.util.Objects;
import java.util.Random;

public class LongRandomizer implements Randomizer<Long> {

    private final Random random;
    private final long min;
    private final long max;
    private final long bound;

    public LongRandomizer(Random random, long min, long max) {
        if (min > max) {
            throw new IllegalArgumentException(
                    "Long randomizer failed initializing, because min '%s' should be less than or equal to max '%s'"
                            .formatted(min, max)
            );
        }
        this.random = random;
        this.min = min;
        this.max = max;
        this.bound = max - min + 1;
    }

    @Override
    public Long next() {
        if (Objects.equals(min, max)) {
            return min;
        }
        return min + Math.abs(random.nextLong() % bound);
    }

}
