package com.devt.randomizer.randomizers.collections;

import com.devt.randomizer.randomizers.Randomizer;

import java.util.List;

public class ListRandomizer<T> extends CollectionRandomizer<T> implements Randomizer<List<T>> {

    public ListRandomizer(Randomizer<T> randomizer, int numberOfElements) {
        super(randomizer, numberOfElements);
    }

    @Override
    public List<T> next() {
        return nextStream().toList();
    }

}
