package com.devt.randomizer.randomizers.collections;

import com.devt.randomizer.randomizers.Randomizer;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public abstract class CollectionRandomizer<T> {

    protected final Randomizer<T> randomizer;
    protected final int numberOfElements;

    protected CollectionRandomizer(Randomizer<T> randomizer, int numberOfElements) {
        if (numberOfElements <= 0) {
            throw new IllegalArgumentException("Collection randomizer failed initializing, because number of elements '%s' must be greater than 0"
                    .formatted(numberOfElements));
        }
        this.randomizer = randomizer;
        this.numberOfElements = numberOfElements;
    }

    protected Stream<T> nextStream() {
        return IntStream.range(0, numberOfElements)
                .boxed()
                .map(_ -> randomizer.next());
    }

}
