package com.devt.randomizer;

import com.devt.randomizer.inventories.FieldRandomizerInventory;
import com.devt.randomizer.randomizers.Randomizer;
import com.devt.randomizer.randomizers.collections.ArrayRandomizer;
import com.devt.randomizer.randomizers.collections.ListRandomizer;
import com.devt.randomizer.randomizers.collections.MapRandomizer;
import com.devt.randomizer.randomizers.collections.SetRandomizer;
import com.devt.randomizer.randomizers.collections.StreamRandomizer;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class RandomizerFactory {

    private final RandomizerParameter parameter;
    private final FieldRandomizerInventory fieldRandomizerInventory;

    public RandomizerFactory() {
        this.parameter = new RandomizerParameter();
        this.fieldRandomizerInventory = new FieldRandomizerInventory(parameter);
    }

    public <T> Randomizer<T> getRandomizer(Class<T> clazz) {
        return fieldRandomizerInventory.get(clazz);
    }

    public <T> Randomizer<List<T>> getListRandomizer(Class<T> clazz) {
        Randomizer<T> elementRandomizer = getRandomizer(clazz);
        return new ListRandomizer<>(elementRandomizer, parameter.getCollectionSize());
    }

    public <T> Randomizer<Set<T>> getSetRandomizer(Class<T> clazz) {
        Randomizer<T> elementRandomizer = getRandomizer(clazz);
        return new SetRandomizer<>(elementRandomizer, parameter.getCollectionSize());
    }

    public <T> Randomizer<T[]> getArrayRandomizer(Class<T> clazz) {
        Randomizer<T> elementRandomizer = getRandomizer(clazz);
        return new ArrayRandomizer<>(elementRandomizer, clazz, parameter.getCollectionSize());
    }

    public <T> Randomizer<Stream<T>> getStreamRandomizer(Class<T> clazz) {
        Randomizer<T> elementRandomizer = getRandomizer(clazz);
        return new StreamRandomizer<>(elementRandomizer, parameter.getCollectionSize());
    }

    public <V, K> Randomizer<Map<K, V>> getMapRandomizer(Class<K> keyClazz, Class<V> valueClazz) {
        Randomizer<K> keyRandomizer = getRandomizer(keyClazz);
        Randomizer<V> valueRandomizer = getRandomizer(valueClazz);
        return new MapRandomizer<>(keyRandomizer, valueRandomizer, parameter.getCollectionSize());
    }

}
