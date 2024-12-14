package com.devt;

import com.devt.impl.AlphabeticRandomizer;
import com.devt.impl.AlphanumericRandomizer;
import com.devt.impl.AlphanumericSpecialCharacterRandomizer;
import com.devt.impl.BooleanRandomizer;
import com.devt.impl.DoubleRandomizer;
import com.devt.impl.EnumRandomizer;
import com.devt.impl.IntegerRandomizer;
import com.devt.impl.ListRandomizer;

import java.util.List;
import java.util.Random;
import java.util.function.Function;

public class Randomizer {

    private static final Integer DEFAULT_STRING_LENGTH = 12;
    private static final Integer DEFAULT_LIST_SIZE = 5;
    private static final Integer DEFAULT_MIN_INTEGER = 0;
    private static final Integer DEFAULT_MAX_INTEGER = 100;
    private static final Double DEFAULT_MIN_DOUBLE = 0.0;
    private static final Double DEFAULT_MAX_DOUBLE = 100.0;

    private static final Random RANDOM = new Random();
    private static final AlphanumericRandomizer ALPHANUMERIC_RANDOMIZER = new AlphanumericRandomizer(RANDOM);
    private static final AlphabeticRandomizer ALPHABETIC_RANDOMIZER = new AlphabeticRandomizer(RANDOM);
    private static final AlphanumericSpecialCharacterRandomizer ALPHANUMERIC_SPECIAL_CHARACTER_RANDOMIZER = new AlphanumericSpecialCharacterRandomizer(RANDOM);
    private static final DoubleRandomizer DOUBLE_RANDOMIZER = new DoubleRandomizer(RANDOM);
    private static final IntegerRandomizer INTEGER_RANDOMIZER = new IntegerRandomizer(RANDOM);
    private static final BooleanRandomizer BOOLEAN_RANDOMIZER = new BooleanRandomizer(RANDOM);
    private static final EnumRandomizer ENUM_RANDOMIZER = new EnumRandomizer(RANDOM);
    private static final ListRandomizer LIST_RANDOMIZER = new ListRandomizer();

    private Randomizer() {
        // utility class
    }

    public static String randomAlphanumeric() {
        return ALPHANUMERIC_RANDOMIZER.next(DEFAULT_STRING_LENGTH);
    }

    public static String randomAlphanumeric(int length) {
        return ALPHANUMERIC_RANDOMIZER.next(length);
    }

    public static String randomAlphabetic() {
        return ALPHABETIC_RANDOMIZER.next(DEFAULT_STRING_LENGTH);
    }

    public static String randomAlphabetic(int length) {
        return ALPHABETIC_RANDOMIZER.next(length);
    }

    public static String randomAlphanumericWithSpecialCharacters() {
        return ALPHANUMERIC_SPECIAL_CHARACTER_RANDOMIZER.next(DEFAULT_STRING_LENGTH);
    }

    public static String randomAlphanumericWithSpecialCharacters(int length) {
        return ALPHANUMERIC_SPECIAL_CHARACTER_RANDOMIZER.next(length);
    }

    public static Double randomDouble() {
        return DOUBLE_RANDOMIZER.next(DEFAULT_MIN_DOUBLE, DEFAULT_MAX_DOUBLE);
    }

    public static Double randomDouble(double min, double max) {
        return DOUBLE_RANDOMIZER.next(min, max);
    }

    public static Integer randomInteger() {
        return INTEGER_RANDOMIZER.next(DEFAULT_MIN_INTEGER, DEFAULT_MAX_INTEGER);
    }

    public static Integer randomInteger(int min, int max) {
        return INTEGER_RANDOMIZER.next(min, max);
    }

    public static Boolean randomBoolean() {
        return BOOLEAN_RANDOMIZER.next();
    }

    public static <T extends Enum<T>> T randomEnum(Class<T> enumClass) {
        return ENUM_RANDOMIZER.next(enumClass);
    }

    public static <T> List<T> randomListOf(Function<Integer, T> elementRandomizer, int numberOfElements) {
        return LIST_RANDOMIZER.next(elementRandomizer, numberOfElements);
    }

    public static <T> List<T> randomListOf(Function<Integer, T> elementRandomizer) {
        return LIST_RANDOMIZER.next(elementRandomizer, DEFAULT_LIST_SIZE);
    }

    public static <T> T random(Class<T> clazz) {
        if (clazz == String.class) {
            return clazz.cast(randomAlphanumeric());
        }
        if (clazz == boolean.class) {
            return (T) (Boolean) randomBoolean().booleanValue();
        }
        if (clazz == Boolean.class) {
            return clazz.cast(randomBoolean());
        }
        if (clazz == int.class) {
            Integer value = randomInteger();
            return (T) value;
        }
        if (clazz == Integer.class) {
            return clazz.cast(randomInteger());
        }
        if (clazz == double.class) {
            Double value = randomDouble();
            return (T) value;
        }
        if (clazz == Double.class) {
            return clazz.cast(randomDouble());
        }
        throw new UnsupportedOperationException("Unsupported type: " + clazz);
    }

}
