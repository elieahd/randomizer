package com.devt.randomizer.randomizers.collections;

import com.devt.randomizer.randomizers.Randomizer;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MapRandomizer<K, V> implements Randomizer<Map<K, V>> {

    private final Randomizer<K> keyRandomizer;
    private final Randomizer<V> valueRandomizer;
    private final int numberOfElements;

    public MapRandomizer(Randomizer<K> keyRandomizer, Randomizer<V> valueRandomizer, int numberOfElements) {
        if (numberOfElements <= 0) {
            throw new IllegalArgumentException(
                    "Collection randomizer failed initializing, because number of elements '%s' must be greater than 0"
                            .formatted(numberOfElements)
            );
        }
        this.keyRandomizer = keyRandomizer;
        this.valueRandomizer = valueRandomizer;
        this.numberOfElements = numberOfElements;
    }

    @Override
    public Map<K, V> next() {
        return IntStream.range(0, numberOfElements)
                .boxed()
                .collect(Collectors.toMap(
                        _ -> keyRandomizer.next(),
                        _ -> valueRandomizer.next()
                ));
    }

}
