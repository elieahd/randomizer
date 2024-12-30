package com.devt.randomizer.randomizers.collections;

import com.devt.randomizer.randomizers.Randomizer;

import java.util.Set;
import java.util.stream.Collectors;

public class SetRandomizer<T> extends CollectionRandomizer<T> implements Randomizer<Set<T>> {

    public SetRandomizer(Randomizer<T> randomizer, int numberOfElements) {
        super(randomizer, numberOfElements);
    }

    @Override
    public Set<T> next() {
        return nextStream()
                .collect(Collectors.toSet());
    }

}
