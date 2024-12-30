package com.devt.randomizer.randomizers.fields.types;

import com.devt.randomizer.randomizers.Randomizer;

import java.util.Objects;
import java.util.Random;

public class ByteRandomizer implements Randomizer<Byte> {

    private final Random random;
    private final byte min;
    private final byte max;

    public ByteRandomizer(Random random, byte min, byte max) {
        if (min > max) {
            throw new IllegalArgumentException(
                    "Byte randomizer failed initializing, because min '%s' should be less than or equal to max '%s'"
                            .formatted(min, max)
            );
        }
        this.random = random;
        this.min = min;
        this.max = max;
    }

    @Override
    public Byte next() {
        if (Objects.equals(min, max)) {
            return min;
        }
        return (byte) (min + random.nextInt(max - min + 1));
    }

}
