package com.devt.randomizer;

import com.devt.randomizer.randomizers.Randomizer;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class RandomizerUtils {

    private static final RandomizerFactory FACTORY = new RandomizerFactory();

    private RandomizerUtils() {
        // utility class
    }

    public static <T> T random(Class<T> clazz) {
        Randomizer<T> randomizer = FACTORY.getRandomizer(clazz);
        return randomizer.next();
    }

    public static <T> List<T> randomListOf(Class<T> clazz) {
        Randomizer<List<T>> randomizer = FACTORY.getListRandomizer(clazz);
        return randomizer.next();
    }

    public static <T> Set<T> randomSetOf(Class<T> clazz) {
        Randomizer<Set<T>> randomizer = FACTORY.getSetRandomizer(clazz);
        return randomizer.next();
    }

    public static <T> T[] randomArrayOf(Class<T> clazz) {
        Randomizer<T[]> randomizer = FACTORY.getArrayRandomizer(clazz);
        return randomizer.next();
    }

    public static <T> Stream<T> randomStreamOf(Class<T> clazz) {
        Randomizer<Stream<T>> randomizer = FACTORY.getStreamRandomizer(clazz);
        return randomizer.next();
    }

    public static <K, V> Map<K, V> randomMapOf(Class<K> keyClazz, Class<V> valueClazz) {
        Randomizer<Map<K, V>> randomizer = FACTORY.getMapRandomizer(keyClazz, valueClazz);
        return randomizer.next();
    }

}
