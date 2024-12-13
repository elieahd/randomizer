package com.devt.impl;

import java.util.Random;

public class EnumRandomizer {

    private final Random random;

    public EnumRandomizer(Random random) {
        this.random = random;
    }

    public <T extends Enum<T>> T next(Class<T> enumClass) {
        T[] values = enumClass.getEnumConstants();
        return values[random.nextInt(values.length)];
    }

}

