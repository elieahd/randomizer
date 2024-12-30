package com.devt.randomizer.randomizers.fields.types;

import com.devt.randomizer.randomizers.Randomizer;

import java.util.Random;

public class EnumRandomizer<T extends Enum<T>> implements Randomizer<T> {

    private final Random random;
    private final T[] values;

    public EnumRandomizer(Random random, Class<T> enumClass) {
        this.random = random;
        if (enumClass.getEnumConstants().length == 0) {
            throw new IllegalArgumentException(
                    "Enum randomizer failed initializing for '%s', because it does not contains any value"
                            .formatted(enumClass.getSimpleName())
            );
        }
        this.values = enumClass.getEnumConstants();
    }

    @Override
    public T next() {
        int index = random.nextInt(values.length);
        return values[index];
    }

}
