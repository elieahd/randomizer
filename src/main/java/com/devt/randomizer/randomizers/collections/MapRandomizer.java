package com.devt.randomizer.randomizers.collections;

import com.devt.randomizer.randomizers.Randomizer;

import java.util.HashMap;
import java.util.Map;

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
        Map<K, V> result = new HashMap<>();
        while (result.size() < numberOfElements) {
            K key = keyRandomizer.next();
            result.computeIfAbsent(key, _ -> valueRandomizer.next());
        }
        return result;
    }

}
