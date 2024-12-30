package com.devt.randomizer.randomizers.fields.numbers;

import com.devt.randomizer.randomizers.Randomizer;

import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

public class ShortRandomizer implements Randomizer<Short> {

    private final Short min;
    private final Short max;

    public ShortRandomizer(short min, short max) {
        if (min > max) {
            throw new IllegalArgumentException(
                    "Short randomizer failed initializing, because min '%s' should be less than or equal to max '%s'"
                            .formatted(min, max)
            );
        }
        this.min = min;
        this.max = max;
    }

    @Override
    public Short next() {
        if (Objects.equals(min, max)) {
            return min;
        }
        return (short) (min + ThreadLocalRandom.current().nextInt(max - min + 1));
    }

}
