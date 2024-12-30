package com.devt.randomizer.randomizers.fields.types;

import com.devt.randomizer.randomizers.Randomizer;

import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

public class ByteRandomizer implements Randomizer<Byte> {

    private final byte min;
    private final byte max;

    public ByteRandomizer(byte min, byte max) {
        if (min > max) {
            throw new IllegalArgumentException(
                    "Byte randomizer failed initializing, because min '%s' should be less than or equal to max '%s'"
                            .formatted(min, max)
            );
        }
        this.min = min;
        this.max = max;
    }

    @Override
    public Byte next() {
        if (Objects.equals(min, max)) {
            return min;
        }
        return (byte) (min + ThreadLocalRandom.current().nextInt(max - min + 1));
    }

}
