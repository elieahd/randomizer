package com.devt.impl;

import java.util.List;
import java.util.function.Function;
import java.util.stream.IntStream;

public class ListRandomizer {

    public <T> List<T> next(Function<Integer, T> elementRandomizer, int numberOfElements) {
        return IntStream.range(0, numberOfElements)
                .boxed()
                .map(elementRandomizer)
                .toList();
    }

}
