package com.devt.randomizer.randomizers.collections;

import com.devt.randomizer.randomizers.Randomizer;

import java.util.stream.Stream;

public class StreamRandomizer<T> extends CollectionRandomizer<T> implements Randomizer<Stream<T>> {

    public StreamRandomizer(Randomizer<T> randomizer, int numberOfElements) {
        super(randomizer, numberOfElements);
    }

    @Override
    public Stream<T> next() {
        return nextStream();
    }
}
