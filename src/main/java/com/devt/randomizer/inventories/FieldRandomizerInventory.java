package com.devt.randomizer.inventories;

import com.devt.randomizer.RandomizerParameter;
import com.devt.randomizer.randomizers.Randomizer;
import com.devt.randomizer.randomizers.fields.dates.DateRandomizer;
import com.devt.randomizer.randomizers.fields.dates.InstantRandomizer;
import com.devt.randomizer.randomizers.fields.dates.LocalDateRandomizer;
import com.devt.randomizer.randomizers.fields.dates.LocalDateTimeRandomizer;
import com.devt.randomizer.randomizers.fields.dates.LocalTimeRandomizer;
import com.devt.randomizer.randomizers.fields.dates.OffsetDateTimeRandomizer;
import com.devt.randomizer.randomizers.fields.dates.OffsetTimeRandomizer;
import com.devt.randomizer.randomizers.fields.dates.SqlDateRandomizer;
import com.devt.randomizer.randomizers.fields.dates.ZonedDateTimeRandomizer;
import com.devt.randomizer.randomizers.fields.numbers.BigDecimalRandomizer;
import com.devt.randomizer.randomizers.fields.numbers.BigIntegerRandomizer;
import com.devt.randomizer.randomizers.fields.numbers.DoubleRandomizer;
import com.devt.randomizer.randomizers.fields.numbers.FloatRandomizer;
import com.devt.randomizer.randomizers.fields.numbers.IntegerRandomizer;
import com.devt.randomizer.randomizers.fields.numbers.LongRandomizer;
import com.devt.randomizer.randomizers.fields.numbers.ShortRandomizer;
import com.devt.randomizer.randomizers.fields.types.BooleanRandomizer;
import com.devt.randomizer.randomizers.fields.types.ByteRandomizer;
import com.devt.randomizer.randomizers.fields.types.CharacterRandomizer;
import com.devt.randomizer.randomizers.fields.types.EnumRandomizer;
import com.devt.randomizer.randomizers.fields.types.StringRandomizer;
import com.devt.randomizer.randomizers.fields.types.UUIDRandomizer;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.UUID;

public class FieldRandomizerInventory {

    protected final Map<Class<?>, Randomizer<?>> randomizers;
    private final RandomizerParameter parameter;
    private final Random random;

    public FieldRandomizerInventory(final RandomizerParameter parameter) {
        super();
        this.parameter = parameter;
        this.random = new Random();
        this.randomizers = new HashMap<>();
        registerStringRandomizer();
        registerBooleanRandomizer();
        registerDoubleRandomizer();
        registerIntegerRandomizer();
        registerShortRandomizer();
        registerLongRandomizer();
        registerFloatRandomizer();
        registerBigDecimalRandomizer();
        registerBigIntegerRandomizer();
        registerByteRandomizer();
        registerCharacterRandomizer();
        registerUUIDRandomizer();
        registerDateRandomizer();
        registerInstantRandomizer();
        registerLocalDateRandomizer();
        registerLocalDateTimeRandomizer();
        registerLocalTimeRandomizer();
        registerOffsetTimeRandomizer();
        registerOffsetDateTimeRandomizer();
        registerSqlDateRandomizer();
        registerZonedDateTimeRandomizer();
    }

    public <T> Randomizer<T> get(Class<T> clazz) {
        final Randomizer<?> randomizer = randomizers.get(clazz);
        if (randomizer != null) {
            return (Randomizer<T>) randomizer;
        }
        if (clazz.isEnum()) {
            return (Randomizer<T>) registerEnum(clazz.asSubclass(Enum.class));
        }
        throw new UnsupportedOperationException("'%s' is not a supported field".formatted(clazz.getName()));
    }

    private <T extends Enum<T>> Randomizer<T> registerEnum(Class<T> enumClazz) {
        EnumRandomizer<T> enumRandomizer = new EnumRandomizer<>(random, enumClazz);
        randomizers.put(enumClazz, enumRandomizer);
        return enumRandomizer;
    }

    private void registerStringRandomizer() {
        Randomizer<String> randomizer = new StringRandomizer(random, parameter.getStringLength(), parameter.getStringCharacters());
        randomizers.put(String.class, randomizer);
    }

    private void registerBooleanRandomizer() {
        Randomizer<Boolean> randomizer = new BooleanRandomizer(random);
        randomizers.put(Boolean.class, randomizer);
        randomizers.put(boolean.class, randomizer);
    }

    private void registerCharacterRandomizer() {
        Randomizer<Character> randomizer = new CharacterRandomizer(random);
        randomizers.put(Character.class, randomizer);
        randomizers.put(char.class, randomizer);
    }

    private void registerByteRandomizer() {
        Randomizer<Byte> randomizer = new ByteRandomizer(random, parameter.getMinByte(), parameter.getMaxByte());
        randomizers.put(Byte.class, randomizer);
        randomizers.put(byte.class, randomizer);
    }

    private void registerDoubleRandomizer() {
        Randomizer<Double> randomizer = new DoubleRandomizer(random, parameter.getMinDouble(), parameter.getMaxDouble());
        randomizers.put(Double.class, randomizer);
        randomizers.put(double.class, randomizer);
    }

    private void registerIntegerRandomizer() {
        Randomizer<Integer> randomizer = new IntegerRandomizer(random, parameter.getMinInteger(), parameter.getMaxInteger());
        randomizers.put(Integer.class, randomizer);
        randomizers.put(int.class, randomizer);
    }

    private void registerShortRandomizer() {
        Randomizer<Short> randomizer = new ShortRandomizer(random, parameter.getMinShort(), parameter.getMaxShort());
        randomizers.put(Short.class, randomizer);
        randomizers.put(short.class, randomizer);
    }

    private void registerLongRandomizer() {
        Randomizer<Long> randomizer = new LongRandomizer(random, parameter.getMinLong(), parameter.getMaxLong());
        randomizers.put(Long.class, randomizer);
        randomizers.put(long.class, randomizer);
    }

    private void registerFloatRandomizer() {
        Randomizer<Float> randomizer = new FloatRandomizer(random, parameter.getMinFloat(), parameter.getMaxFloat());
        randomizers.put(Float.class, randomizer);
        randomizers.put(float.class, randomizer);
    }

    private void registerBigDecimalRandomizer() {
        Randomizer<BigDecimal> randomizer = new BigDecimalRandomizer(random, parameter.getMinBigDecimal(), parameter.getMaxBigDecimal(), parameter.getScaleBigDecimal(), parameter.getRoundingModeBigDecimal());
        randomizers.put(BigDecimal.class, randomizer);
    }

    private void registerBigIntegerRandomizer() {
        Randomizer<BigInteger> randomizer = new BigIntegerRandomizer(random, parameter.getMinBigInteger(), parameter.getMaxBigInteger());
        randomizers.put(BigInteger.class, randomizer);
    }

    private void registerUUIDRandomizer() {
        Randomizer<UUID> randomizer = new UUIDRandomizer();
        randomizers.put(UUID.class, randomizer);
    }

    private void registerZonedDateTimeRandomizer() {
        Randomizer<ZonedDateTime> randomizer = new ZonedDateTimeRandomizer(random, parameter.getFromDate(), parameter.getToDate());
        randomizers.put(ZonedDateTime.class, randomizer);
    }

    private void registerSqlDateRandomizer() {
        Randomizer<java.sql.Date> randomizer = new SqlDateRandomizer(random, parameter.getFromDate(), parameter.getToDate());
        randomizers.put(java.sql.Date.class, randomizer);
    }

    private void registerOffsetDateTimeRandomizer() {
        Randomizer<OffsetDateTime> randomizer = new OffsetDateTimeRandomizer(random, parameter.getFromDate(), parameter.getToDate());
        randomizers.put(OffsetDateTime.class, randomizer);
    }

    private void registerOffsetTimeRandomizer() {
        Randomizer<OffsetTime> randomizer = new OffsetTimeRandomizer(random, parameter.getFromDate(), parameter.getToDate());
        randomizers.put(OffsetTime.class, randomizer);
    }

    private void registerLocalTimeRandomizer() {
        Randomizer<LocalTime> randomizer = new LocalTimeRandomizer(random, parameter.getFromDate(), parameter.getToDate());
        randomizers.put(LocalTime.class, randomizer);
    }

    private void registerLocalDateTimeRandomizer() {
        Randomizer<LocalDateTime> randomizer = new LocalDateTimeRandomizer(random, parameter.getFromDate(), parameter.getToDate());
        randomizers.put(LocalDateTime.class, randomizer);
    }

    private void registerLocalDateRandomizer() {
        Randomizer<LocalDate> randomizer = new LocalDateRandomizer(random, parameter.getFromDate(), parameter.getToDate());
        randomizers.put(LocalDate.class, randomizer);
    }

    private void registerInstantRandomizer() {
        Randomizer<Instant> randomizer = new InstantRandomizer(random, parameter.getFromDate(), parameter.getToDate());
        randomizers.put(Instant.class, randomizer);
    }

    private void registerDateRandomizer() {
        Randomizer<Date> randomizer = new DateRandomizer(random, parameter.getFromDate(), parameter.getToDate());
        randomizers.put(Date.class, randomizer);
    }

}
