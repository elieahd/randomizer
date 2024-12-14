package com.devt.impl;

import java.util.List;
import java.util.function.Function;
import java.util.stream.IntStream;

public class ListRandomizer {

    public <T> List<T> next(Function<Integer, T> elementRandomizer, int numberOfElements) {
        if (numberOfElements < 0) {
            throw new IllegalArgumentException(
                    "Randomizing list of elements failed, because number of elements '%s' is less than 0"
                            .formatted(numberOfElements)
            );
        }
        return IntStream.range(0, numberOfElements)
                .boxed()
                .map(elementRandomizer)
                .toList();
    }

}
