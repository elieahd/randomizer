package com.devt.randomizer.randomizers.collections;

import com.devt.randomizer.randomizers.Randomizer;

import java.lang.reflect.Array;

public class ArrayRandomizer<T> extends CollectionRandomizer<T> implements Randomizer<T[]> {

    private final Class<T> clazz;

    public ArrayRandomizer(Randomizer<T> randomizer, Class<T> clazz, int numberOfElements) {
        super(randomizer, numberOfElements);
        this.clazz = clazz;
    }

    @Override
    public T[] next() {
        T[] array = (T[]) Array.newInstance(clazz, numberOfElements);
        for (int i = 0; i < numberOfElements; i++) {
            array[i] = randomizer.next();
        }
        return array;
    }

}
