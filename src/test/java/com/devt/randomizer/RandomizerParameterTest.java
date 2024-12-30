package com.devt.randomizer;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.time.LocalDateTime;

import static org.assertj.core.api.Assertions.assertThat;

class RandomizerParameterTest {

    static final int DEFAULT_STRING_LENGTH = 10;
    static final String DEFAULT_STRING_CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()-_=+[]{}|;:'\",./<>?";
    static final int DEFAULT_COLLECTION_SIZE = 5;
    static final int DEFAULT_MIN_INTEGER = 0;
    static final int DEFAULT_MAX_INTEGER = 100;
    static final double DEFAULT_MIN_DOUBLE = 0.0;
    static final double DEFAULT_MAX_DOUBLE = 100.0;
    static final short DEFAULT_MIN_SHORT = 0;
    static final short DEFAULT_MAX_SHORT = 100;
    static final long DEFAULT_MIN_LONG = 0L;
    static final long DEFAULT_MAX_LONG = 100L;
    static final float DEFAULT_MIN_FLOAT = 0.0f;
    static final float DEFAULT_MAX_FLOAT = 100.0f;
    static final byte DEFAULT_MIN_BYTE = -128;
    static final byte DEFAULT_MAX_BYE = 127;
    static final BigInteger DEFAULT_MIN_BIG_INTEGER = BigInteger.ZERO;
    static final BigInteger DEFAULT_MAX_BIG_INTEGER = BigInteger.valueOf(100L);
    static final BigDecimal DEFAULT_MIN_BIG_DECIMAL = BigDecimal.ZERO;
    static final BigDecimal DEFAULT_MAX_BIG_DECIMAL = BigDecimal.valueOf(100.0);
    static final int DEFAULT_SCALE_BIG_DECIMAL = 2;
    static final RoundingMode DEFAULT_ROUNDING_MODE_BIG_DECIMAL = RoundingMode.HALF_UP;
    static final LocalDateTime DEFAULT_FROM_DATE = LocalDateTime.of(2000, 1, 1, 0, 0, 0);
    static final LocalDateTime DEFAULT_TO_DATE = LocalDateTime.of(2030, 12, 31, 23, 59, 59);

    @Test
    void shouldHaveDefaultValues() {
        // Act
        RandomizerParameter parameter = new RandomizerParameter();
        // Assert
        assertThat(parameter.getCollectionSize()).isEqualTo(DEFAULT_COLLECTION_SIZE);
        assertThat(parameter.getStringLength()).isEqualTo(DEFAULT_STRING_LENGTH);
        assertThat(parameter.getStringCharacters()).isEqualTo(DEFAULT_STRING_CHARACTERS);
        assertThat(parameter.getMinInteger()).isEqualTo(DEFAULT_MIN_INTEGER);
        assertThat(parameter.getMaxInteger()).isEqualTo(DEFAULT_MAX_INTEGER);
        assertThat(parameter.getMinDouble()).isEqualTo(DEFAULT_MIN_DOUBLE);
        assertThat(parameter.getMaxDouble()).isEqualTo(DEFAULT_MAX_DOUBLE);
        assertThat(parameter.getMinShort()).isEqualTo(DEFAULT_MIN_SHORT);
        assertThat(parameter.getMaxShort()).isEqualTo(DEFAULT_MAX_SHORT);
        assertThat(parameter.getMinLong()).isEqualTo(DEFAULT_MIN_LONG);
        assertThat(parameter.getMaxLong()).isEqualTo(DEFAULT_MAX_LONG);
        assertThat(parameter.getMinFloat()).isEqualTo(DEFAULT_MIN_FLOAT);
        assertThat(parameter.getMaxFloat()).isEqualTo(DEFAULT_MAX_FLOAT);
        assertThat(parameter.getMinByte()).isEqualTo(DEFAULT_MIN_BYTE);
        assertThat(parameter.getMaxByte()).isEqualTo(DEFAULT_MAX_BYE);
        assertThat(parameter.getMinBigInteger()).isEqualTo(DEFAULT_MIN_BIG_INTEGER);
        assertThat(parameter.getMaxBigInteger()).isEqualTo(DEFAULT_MAX_BIG_INTEGER);
        assertThat(parameter.getMinBigDecimal()).isEqualTo(DEFAULT_MIN_BIG_DECIMAL);
        assertThat(parameter.getMaxBigDecimal()).isEqualTo(DEFAULT_MAX_BIG_DECIMAL);
        assertThat(parameter.getScaleBigDecimal()).isEqualTo(DEFAULT_SCALE_BIG_DECIMAL);
        assertThat(parameter.getRoundingModeBigDecimal()).isEqualTo(DEFAULT_ROUNDING_MODE_BIG_DECIMAL);
        assertThat(parameter.getFromDate()).isEqualTo(DEFAULT_FROM_DATE);
        assertThat(parameter.getToDate()).isEqualTo(DEFAULT_TO_DATE);
    }

    @Test
    void shouldOverrideCollectionSizeValues() {
        // Arrange
        int collectionSize = 20;
        // Act
        RandomizerParameter parameter = new RandomizerParameter.Builder()
                .withCollection(collectionSize)
                .build();
        // Assert
        assertThat(parameter.getCollectionSize()).isEqualTo(collectionSize);
        assertThat(parameter.getStringLength()).isEqualTo(DEFAULT_STRING_LENGTH);
        assertThat(parameter.getStringCharacters()).isEqualTo(DEFAULT_STRING_CHARACTERS);
        assertThat(parameter.getMinInteger()).isEqualTo(DEFAULT_MIN_INTEGER);
        assertThat(parameter.getMaxInteger()).isEqualTo(DEFAULT_MAX_INTEGER);
        assertThat(parameter.getMinDouble()).isEqualTo(DEFAULT_MIN_DOUBLE);
        assertThat(parameter.getMaxDouble()).isEqualTo(DEFAULT_MAX_DOUBLE);
        assertThat(parameter.getMinShort()).isEqualTo(DEFAULT_MIN_SHORT);
        assertThat(parameter.getMaxShort()).isEqualTo(DEFAULT_MAX_SHORT);
        assertThat(parameter.getMinLong()).isEqualTo(DEFAULT_MIN_LONG);
        assertThat(parameter.getMaxLong()).isEqualTo(DEFAULT_MAX_LONG);
        assertThat(parameter.getMinFloat()).isEqualTo(DEFAULT_MIN_FLOAT);
        assertThat(parameter.getMaxFloat()).isEqualTo(DEFAULT_MAX_FLOAT);
        assertThat(parameter.getMinByte()).isEqualTo(DEFAULT_MIN_BYTE);
        assertThat(parameter.getMaxByte()).isEqualTo(DEFAULT_MAX_BYE);
        assertThat(parameter.getMinBigInteger()).isEqualTo(DEFAULT_MIN_BIG_INTEGER);
        assertThat(parameter.getMaxBigInteger()).isEqualTo(DEFAULT_MAX_BIG_INTEGER);
        assertThat(parameter.getMinBigDecimal()).isEqualTo(DEFAULT_MIN_BIG_DECIMAL);
        assertThat(parameter.getMaxBigDecimal()).isEqualTo(DEFAULT_MAX_BIG_DECIMAL);
        assertThat(parameter.getScaleBigDecimal()).isEqualTo(DEFAULT_SCALE_BIG_DECIMAL);
        assertThat(parameter.getRoundingModeBigDecimal()).isEqualTo(DEFAULT_ROUNDING_MODE_BIG_DECIMAL);
        assertThat(parameter.getFromDate()).isEqualTo(DEFAULT_FROM_DATE);
        assertThat(parameter.getToDate()).isEqualTo(DEFAULT_TO_DATE);
    }

    @Test
    void shouldOverrideStringValues() {
        // Arrange
        int length = 12;
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        // Act
        RandomizerParameter parameter = new RandomizerParameter.Builder()
                .withString(length, characters)
                .build();
        // Assert
        assertThat(parameter.getCollectionSize()).isEqualTo(DEFAULT_COLLECTION_SIZE);
        assertThat(parameter.getStringLength()).isEqualTo(length);
        assertThat(parameter.getStringCharacters()).isEqualTo(characters);
        assertThat(parameter.getMinInteger()).isEqualTo(DEFAULT_MIN_INTEGER);
        assertThat(parameter.getMaxInteger()).isEqualTo(DEFAULT_MAX_INTEGER);
        assertThat(parameter.getMinDouble()).isEqualTo(DEFAULT_MIN_DOUBLE);
        assertThat(parameter.getMaxDouble()).isEqualTo(DEFAULT_MAX_DOUBLE);
        assertThat(parameter.getMinShort()).isEqualTo(DEFAULT_MIN_SHORT);
        assertThat(parameter.getMaxShort()).isEqualTo(DEFAULT_MAX_SHORT);
        assertThat(parameter.getMinLong()).isEqualTo(DEFAULT_MIN_LONG);
        assertThat(parameter.getMaxLong()).isEqualTo(DEFAULT_MAX_LONG);
        assertThat(parameter.getMinFloat()).isEqualTo(DEFAULT_MIN_FLOAT);
        assertThat(parameter.getMaxFloat()).isEqualTo(DEFAULT_MAX_FLOAT);
        assertThat(parameter.getMinByte()).isEqualTo(DEFAULT_MIN_BYTE);
        assertThat(parameter.getMaxByte()).isEqualTo(DEFAULT_MAX_BYE);
        assertThat(parameter.getMinBigInteger()).isEqualTo(DEFAULT_MIN_BIG_INTEGER);
        assertThat(parameter.getMaxBigInteger()).isEqualTo(DEFAULT_MAX_BIG_INTEGER);
        assertThat(parameter.getMinBigDecimal()).isEqualTo(DEFAULT_MIN_BIG_DECIMAL);
        assertThat(parameter.getMaxBigDecimal()).isEqualTo(DEFAULT_MAX_BIG_DECIMAL);
        assertThat(parameter.getScaleBigDecimal()).isEqualTo(DEFAULT_SCALE_BIG_DECIMAL);
        assertThat(parameter.getRoundingModeBigDecimal()).isEqualTo(DEFAULT_ROUNDING_MODE_BIG_DECIMAL);
        assertThat(parameter.getFromDate()).isEqualTo(DEFAULT_FROM_DATE);
        assertThat(parameter.getToDate()).isEqualTo(DEFAULT_TO_DATE);
    }

    @Test
    void shouldOverrideIntegerValues() {
        // Arrange
        int minInteger = 2;
        int maxInteger = 50;
        // Act
        RandomizerParameter parameter = new RandomizerParameter.Builder()
                .withInteger(minInteger, maxInteger)
                .build();
        // Assert
        assertThat(parameter.getCollectionSize()).isEqualTo(DEFAULT_COLLECTION_SIZE);
        assertThat(parameter.getStringLength()).isEqualTo(DEFAULT_STRING_LENGTH);
        assertThat(parameter.getStringCharacters()).isEqualTo(DEFAULT_STRING_CHARACTERS);
        assertThat(parameter.getMinInteger()).isEqualTo(minInteger);
        assertThat(parameter.getMaxInteger()).isEqualTo(maxInteger);
        assertThat(parameter.getMinDouble()).isEqualTo(DEFAULT_MIN_DOUBLE);
        assertThat(parameter.getMaxDouble()).isEqualTo(DEFAULT_MAX_DOUBLE);
        assertThat(parameter.getMinShort()).isEqualTo(DEFAULT_MIN_SHORT);
        assertThat(parameter.getMaxShort()).isEqualTo(DEFAULT_MAX_SHORT);
        assertThat(parameter.getMinLong()).isEqualTo(DEFAULT_MIN_LONG);
        assertThat(parameter.getMaxLong()).isEqualTo(DEFAULT_MAX_LONG);
        assertThat(parameter.getMinFloat()).isEqualTo(DEFAULT_MIN_FLOAT);
        assertThat(parameter.getMaxFloat()).isEqualTo(DEFAULT_MAX_FLOAT);
        assertThat(parameter.getMinByte()).isEqualTo(DEFAULT_MIN_BYTE);
        assertThat(parameter.getMaxByte()).isEqualTo(DEFAULT_MAX_BYE);
        assertThat(parameter.getMinBigInteger()).isEqualTo(DEFAULT_MIN_BIG_INTEGER);
        assertThat(parameter.getMaxBigInteger()).isEqualTo(DEFAULT_MAX_BIG_INTEGER);
        assertThat(parameter.getMinBigDecimal()).isEqualTo(DEFAULT_MIN_BIG_DECIMAL);
        assertThat(parameter.getMaxBigDecimal()).isEqualTo(DEFAULT_MAX_BIG_DECIMAL);
        assertThat(parameter.getScaleBigDecimal()).isEqualTo(DEFAULT_SCALE_BIG_DECIMAL);
        assertThat(parameter.getRoundingModeBigDecimal()).isEqualTo(DEFAULT_ROUNDING_MODE_BIG_DECIMAL);
        assertThat(parameter.getFromDate()).isEqualTo(DEFAULT_FROM_DATE);
        assertThat(parameter.getToDate()).isEqualTo(DEFAULT_TO_DATE);
    }

    @Test
    void shouldOverrideDoubleValues() {
        // Arrange
        double minDouble = 2.0;
        double maxDouble = 50.0;
        // Act
        RandomizerParameter parameter = new RandomizerParameter.Builder()
                .withDouble(minDouble, maxDouble)
                .build();
        // Assert
        assertThat(parameter.getCollectionSize()).isEqualTo(DEFAULT_COLLECTION_SIZE);
        assertThat(parameter.getStringLength()).isEqualTo(DEFAULT_STRING_LENGTH);
        assertThat(parameter.getStringCharacters()).isEqualTo(DEFAULT_STRING_CHARACTERS);
        assertThat(parameter.getMinInteger()).isEqualTo(DEFAULT_MIN_INTEGER);
        assertThat(parameter.getMaxInteger()).isEqualTo(DEFAULT_MAX_INTEGER);
        assertThat(parameter.getMinDouble()).isEqualTo(minDouble);
        assertThat(parameter.getMaxDouble()).isEqualTo(maxDouble);
        assertThat(parameter.getMinShort()).isEqualTo(DEFAULT_MIN_SHORT);
        assertThat(parameter.getMaxShort()).isEqualTo(DEFAULT_MAX_SHORT);
        assertThat(parameter.getMinLong()).isEqualTo(DEFAULT_MIN_LONG);
        assertThat(parameter.getMaxLong()).isEqualTo(DEFAULT_MAX_LONG);
        assertThat(parameter.getMinFloat()).isEqualTo(DEFAULT_MIN_FLOAT);
        assertThat(parameter.getMaxFloat()).isEqualTo(DEFAULT_MAX_FLOAT);
        assertThat(parameter.getMinByte()).isEqualTo(DEFAULT_MIN_BYTE);
        assertThat(parameter.getMaxByte()).isEqualTo(DEFAULT_MAX_BYE);
        assertThat(parameter.getMinBigInteger()).isEqualTo(DEFAULT_MIN_BIG_INTEGER);
        assertThat(parameter.getMaxBigInteger()).isEqualTo(DEFAULT_MAX_BIG_INTEGER);
        assertThat(parameter.getMinBigDecimal()).isEqualTo(DEFAULT_MIN_BIG_DECIMAL);
        assertThat(parameter.getMaxBigDecimal()).isEqualTo(DEFAULT_MAX_BIG_DECIMAL);
        assertThat(parameter.getScaleBigDecimal()).isEqualTo(DEFAULT_SCALE_BIG_DECIMAL);
        assertThat(parameter.getRoundingModeBigDecimal()).isEqualTo(DEFAULT_ROUNDING_MODE_BIG_DECIMAL);
        assertThat(parameter.getFromDate()).isEqualTo(DEFAULT_FROM_DATE);
        assertThat(parameter.getToDate()).isEqualTo(DEFAULT_TO_DATE);
    }

    @Test
    void shouldOverrideShortValues() {
        // Arrange
        short minShort = 2;
        short maxShort = 50;
        // Act
        RandomizerParameter parameter = new RandomizerParameter.Builder()
                .withShort(minShort, maxShort)
                .build();
        // Assert
        assertThat(parameter.getCollectionSize()).isEqualTo(DEFAULT_COLLECTION_SIZE);
        assertThat(parameter.getStringLength()).isEqualTo(DEFAULT_STRING_LENGTH);
        assertThat(parameter.getStringCharacters()).isEqualTo(DEFAULT_STRING_CHARACTERS);
        assertThat(parameter.getMinInteger()).isEqualTo(DEFAULT_MIN_INTEGER);
        assertThat(parameter.getMaxInteger()).isEqualTo(DEFAULT_MAX_INTEGER);
        assertThat(parameter.getMinDouble()).isEqualTo(DEFAULT_MIN_DOUBLE);
        assertThat(parameter.getMaxDouble()).isEqualTo(DEFAULT_MAX_DOUBLE);
        assertThat(parameter.getMinShort()).isEqualTo(minShort);
        assertThat(parameter.getMaxShort()).isEqualTo(maxShort);
        assertThat(parameter.getMinLong()).isEqualTo(DEFAULT_MIN_LONG);
        assertThat(parameter.getMaxLong()).isEqualTo(DEFAULT_MAX_LONG);
        assertThat(parameter.getMinFloat()).isEqualTo(DEFAULT_MIN_FLOAT);
        assertThat(parameter.getMaxFloat()).isEqualTo(DEFAULT_MAX_FLOAT);
        assertThat(parameter.getMinByte()).isEqualTo(DEFAULT_MIN_BYTE);
        assertThat(parameter.getMaxByte()).isEqualTo(DEFAULT_MAX_BYE);
        assertThat(parameter.getMinBigInteger()).isEqualTo(DEFAULT_MIN_BIG_INTEGER);
        assertThat(parameter.getMaxBigInteger()).isEqualTo(DEFAULT_MAX_BIG_INTEGER);
        assertThat(parameter.getMinBigDecimal()).isEqualTo(DEFAULT_MIN_BIG_DECIMAL);
        assertThat(parameter.getMaxBigDecimal()).isEqualTo(DEFAULT_MAX_BIG_DECIMAL);
        assertThat(parameter.getScaleBigDecimal()).isEqualTo(DEFAULT_SCALE_BIG_DECIMAL);
        assertThat(parameter.getRoundingModeBigDecimal()).isEqualTo(DEFAULT_ROUNDING_MODE_BIG_DECIMAL);
        assertThat(parameter.getFromDate()).isEqualTo(DEFAULT_FROM_DATE);
        assertThat(parameter.getToDate()).isEqualTo(DEFAULT_TO_DATE);
    }

    @Test
    void shouldOverrideLongValues() {
        // Arrange
        long minLong = 20L;
        long maxLong = 50L;
        // Act
        RandomizerParameter parameter = new RandomizerParameter.Builder()
                .withLong(minLong, maxLong)
                .build();
        // Assert
        assertThat(parameter.getCollectionSize()).isEqualTo(DEFAULT_COLLECTION_SIZE);
        assertThat(parameter.getStringLength()).isEqualTo(DEFAULT_STRING_LENGTH);
        assertThat(parameter.getStringCharacters()).isEqualTo(DEFAULT_STRING_CHARACTERS);
        assertThat(parameter.getMinInteger()).isEqualTo(DEFAULT_MIN_INTEGER);
        assertThat(parameter.getMaxInteger()).isEqualTo(DEFAULT_MAX_INTEGER);
        assertThat(parameter.getMinDouble()).isEqualTo(DEFAULT_MIN_DOUBLE);
        assertThat(parameter.getMaxDouble()).isEqualTo(DEFAULT_MAX_DOUBLE);
        assertThat(parameter.getMinShort()).isEqualTo(DEFAULT_MIN_SHORT);
        assertThat(parameter.getMaxShort()).isEqualTo(DEFAULT_MAX_SHORT);
        assertThat(parameter.getMinLong()).isEqualTo(minLong);
        assertThat(parameter.getMaxLong()).isEqualTo(maxLong);
        assertThat(parameter.getMinFloat()).isEqualTo(DEFAULT_MIN_FLOAT);
        assertThat(parameter.getMaxFloat()).isEqualTo(DEFAULT_MAX_FLOAT);
        assertThat(parameter.getMinByte()).isEqualTo(DEFAULT_MIN_BYTE);
        assertThat(parameter.getMaxByte()).isEqualTo(DEFAULT_MAX_BYE);
        assertThat(parameter.getMinBigInteger()).isEqualTo(DEFAULT_MIN_BIG_INTEGER);
        assertThat(parameter.getMaxBigInteger()).isEqualTo(DEFAULT_MAX_BIG_INTEGER);
        assertThat(parameter.getMinBigDecimal()).isEqualTo(DEFAULT_MIN_BIG_DECIMAL);
        assertThat(parameter.getMaxBigDecimal()).isEqualTo(DEFAULT_MAX_BIG_DECIMAL);
        assertThat(parameter.getScaleBigDecimal()).isEqualTo(DEFAULT_SCALE_BIG_DECIMAL);
        assertThat(parameter.getRoundingModeBigDecimal()).isEqualTo(DEFAULT_ROUNDING_MODE_BIG_DECIMAL);
        assertThat(parameter.getFromDate()).isEqualTo(DEFAULT_FROM_DATE);
        assertThat(parameter.getToDate()).isEqualTo(DEFAULT_TO_DATE);
    }

    @Test
    void shouldOverrideFloatValues() {
        // Arrange
        float minFloat = 2.0f;
        float maxFloat = 50.0f;
        // Act
        RandomizerParameter parameter = new RandomizerParameter.Builder()
                .withFloat(minFloat, maxFloat)
                .build();
        // Assert
        assertThat(parameter.getCollectionSize()).isEqualTo(DEFAULT_COLLECTION_SIZE);
        assertThat(parameter.getStringLength()).isEqualTo(DEFAULT_STRING_LENGTH);
        assertThat(parameter.getStringCharacters()).isEqualTo(DEFAULT_STRING_CHARACTERS);
        assertThat(parameter.getMinInteger()).isEqualTo(DEFAULT_MIN_INTEGER);
        assertThat(parameter.getMaxInteger()).isEqualTo(DEFAULT_MAX_INTEGER);
        assertThat(parameter.getMinDouble()).isEqualTo(DEFAULT_MIN_DOUBLE);
        assertThat(parameter.getMaxDouble()).isEqualTo(DEFAULT_MAX_DOUBLE);
        assertThat(parameter.getMinShort()).isEqualTo(DEFAULT_MIN_SHORT);
        assertThat(parameter.getMaxShort()).isEqualTo(DEFAULT_MAX_SHORT);
        assertThat(parameter.getMinLong()).isEqualTo(DEFAULT_MIN_LONG);
        assertThat(parameter.getMaxLong()).isEqualTo(DEFAULT_MAX_LONG);
        assertThat(parameter.getMinFloat()).isEqualTo(minFloat);
        assertThat(parameter.getMaxFloat()).isEqualTo(maxFloat);
        assertThat(parameter.getMinByte()).isEqualTo(DEFAULT_MIN_BYTE);
        assertThat(parameter.getMaxByte()).isEqualTo(DEFAULT_MAX_BYE);
        assertThat(parameter.getMinBigInteger()).isEqualTo(DEFAULT_MIN_BIG_INTEGER);
        assertThat(parameter.getMaxBigInteger()).isEqualTo(DEFAULT_MAX_BIG_INTEGER);
        assertThat(parameter.getMinBigDecimal()).isEqualTo(DEFAULT_MIN_BIG_DECIMAL);
        assertThat(parameter.getMaxBigDecimal()).isEqualTo(DEFAULT_MAX_BIG_DECIMAL);
        assertThat(parameter.getScaleBigDecimal()).isEqualTo(DEFAULT_SCALE_BIG_DECIMAL);
        assertThat(parameter.getRoundingModeBigDecimal()).isEqualTo(DEFAULT_ROUNDING_MODE_BIG_DECIMAL);
        assertThat(parameter.getFromDate()).isEqualTo(DEFAULT_FROM_DATE);
        assertThat(parameter.getToDate()).isEqualTo(DEFAULT_TO_DATE);
    }

    @Test
    void shouldOverrideByteValues() {
        // Arrange
        byte minByte = 0;
        byte maxByte = 127;
        // Act
        RandomizerParameter parameter = new RandomizerParameter.Builder()
                .withByte(minByte, maxByte)
                .build();
        // Assert
        assertThat(parameter.getCollectionSize()).isEqualTo(DEFAULT_COLLECTION_SIZE);
        assertThat(parameter.getStringLength()).isEqualTo(DEFAULT_STRING_LENGTH);
        assertThat(parameter.getStringCharacters()).isEqualTo(DEFAULT_STRING_CHARACTERS);
        assertThat(parameter.getMinInteger()).isEqualTo(DEFAULT_MIN_INTEGER);
        assertThat(parameter.getMaxInteger()).isEqualTo(DEFAULT_MAX_INTEGER);
        assertThat(parameter.getMinDouble()).isEqualTo(DEFAULT_MIN_DOUBLE);
        assertThat(parameter.getMaxDouble()).isEqualTo(DEFAULT_MAX_DOUBLE);
        assertThat(parameter.getMinShort()).isEqualTo(DEFAULT_MIN_SHORT);
        assertThat(parameter.getMaxShort()).isEqualTo(DEFAULT_MAX_SHORT);
        assertThat(parameter.getMinLong()).isEqualTo(DEFAULT_MIN_LONG);
        assertThat(parameter.getMaxLong()).isEqualTo(DEFAULT_MAX_LONG);
        assertThat(parameter.getMinFloat()).isEqualTo(DEFAULT_MIN_FLOAT);
        assertThat(parameter.getMaxFloat()).isEqualTo(DEFAULT_MAX_FLOAT);
        assertThat(parameter.getMinByte()).isEqualTo(minByte);
        assertThat(parameter.getMaxByte()).isEqualTo(maxByte);
        assertThat(parameter.getMinBigInteger()).isEqualTo(DEFAULT_MIN_BIG_INTEGER);
        assertThat(parameter.getMaxBigInteger()).isEqualTo(DEFAULT_MAX_BIG_INTEGER);
        assertThat(parameter.getMinBigDecimal()).isEqualTo(DEFAULT_MIN_BIG_DECIMAL);
        assertThat(parameter.getMaxBigDecimal()).isEqualTo(DEFAULT_MAX_BIG_DECIMAL);
        assertThat(parameter.getScaleBigDecimal()).isEqualTo(DEFAULT_SCALE_BIG_DECIMAL);
        assertThat(parameter.getRoundingModeBigDecimal()).isEqualTo(DEFAULT_ROUNDING_MODE_BIG_DECIMAL);
        assertThat(parameter.getFromDate()).isEqualTo(DEFAULT_FROM_DATE);
        assertThat(parameter.getToDate()).isEqualTo(DEFAULT_TO_DATE);
    }

    @Test
    void shouldOverrideBigIntegerValues() {
        // Arrange
        BigInteger min = BigInteger.TWO;
        BigInteger max = BigInteger.valueOf(50L);
        // Act
        RandomizerParameter parameter = new RandomizerParameter.Builder()
                .withBigInteger(min, max)
                .build();
        // Assert
        assertThat(parameter.getCollectionSize()).isEqualTo(DEFAULT_COLLECTION_SIZE);
        assertThat(parameter.getStringLength()).isEqualTo(DEFAULT_STRING_LENGTH);
        assertThat(parameter.getStringCharacters()).isEqualTo(DEFAULT_STRING_CHARACTERS);
        assertThat(parameter.getMinInteger()).isEqualTo(DEFAULT_MIN_INTEGER);
        assertThat(parameter.getMaxInteger()).isEqualTo(DEFAULT_MAX_INTEGER);
        assertThat(parameter.getMinDouble()).isEqualTo(DEFAULT_MIN_DOUBLE);
        assertThat(parameter.getMaxDouble()).isEqualTo(DEFAULT_MAX_DOUBLE);
        assertThat(parameter.getMinShort()).isEqualTo(DEFAULT_MIN_SHORT);
        assertThat(parameter.getMaxShort()).isEqualTo(DEFAULT_MAX_SHORT);
        assertThat(parameter.getMinLong()).isEqualTo(DEFAULT_MIN_LONG);
        assertThat(parameter.getMaxLong()).isEqualTo(DEFAULT_MAX_LONG);
        assertThat(parameter.getMinFloat()).isEqualTo(DEFAULT_MIN_FLOAT);
        assertThat(parameter.getMaxFloat()).isEqualTo(DEFAULT_MAX_FLOAT);
        assertThat(parameter.getMinByte()).isEqualTo(DEFAULT_MIN_BYTE);
        assertThat(parameter.getMaxByte()).isEqualTo(DEFAULT_MAX_BYE);
        assertThat(parameter.getMinBigInteger()).isEqualTo(min);
        assertThat(parameter.getMaxBigInteger()).isEqualTo(max);
        assertThat(parameter.getMinBigDecimal()).isEqualTo(DEFAULT_MIN_BIG_DECIMAL);
        assertThat(parameter.getMaxBigDecimal()).isEqualTo(DEFAULT_MAX_BIG_DECIMAL);
        assertThat(parameter.getScaleBigDecimal()).isEqualTo(DEFAULT_SCALE_BIG_DECIMAL);
        assertThat(parameter.getRoundingModeBigDecimal()).isEqualTo(DEFAULT_ROUNDING_MODE_BIG_DECIMAL);
        assertThat(parameter.getFromDate()).isEqualTo(DEFAULT_FROM_DATE);
        assertThat(parameter.getToDate()).isEqualTo(DEFAULT_TO_DATE);
    }

    @Test
    void shouldOverrideBigDecimalValues() {
        // Arrange
        BigDecimal min = BigDecimal.TWO;
        BigDecimal max = BigDecimal.valueOf(50.0);
        int scale = 4;
        RoundingMode roundingMode = RoundingMode.FLOOR;
        // Act
        RandomizerParameter parameter = new RandomizerParameter.Builder()
                .withBigDecimal(min, max, scale, roundingMode)
                .build();
        // Assert
        assertThat(parameter.getCollectionSize()).isEqualTo(DEFAULT_COLLECTION_SIZE);
        assertThat(parameter.getStringLength()).isEqualTo(DEFAULT_STRING_LENGTH);
        assertThat(parameter.getStringCharacters()).isEqualTo(DEFAULT_STRING_CHARACTERS);
        assertThat(parameter.getMinInteger()).isEqualTo(DEFAULT_MIN_INTEGER);
        assertThat(parameter.getMaxInteger()).isEqualTo(DEFAULT_MAX_INTEGER);
        assertThat(parameter.getMinDouble()).isEqualTo(DEFAULT_MIN_DOUBLE);
        assertThat(parameter.getMaxDouble()).isEqualTo(DEFAULT_MAX_DOUBLE);
        assertThat(parameter.getMinShort()).isEqualTo(DEFAULT_MIN_SHORT);
        assertThat(parameter.getMaxShort()).isEqualTo(DEFAULT_MAX_SHORT);
        assertThat(parameter.getMinLong()).isEqualTo(DEFAULT_MIN_LONG);
        assertThat(parameter.getMaxLong()).isEqualTo(DEFAULT_MAX_LONG);
        assertThat(parameter.getMinFloat()).isEqualTo(DEFAULT_MIN_FLOAT);
        assertThat(parameter.getMaxFloat()).isEqualTo(DEFAULT_MAX_FLOAT);
        assertThat(parameter.getMinByte()).isEqualTo(DEFAULT_MIN_BYTE);
        assertThat(parameter.getMaxByte()).isEqualTo(DEFAULT_MAX_BYE);
        assertThat(parameter.getMinBigInteger()).isEqualTo(DEFAULT_MIN_BIG_INTEGER);
        assertThat(parameter.getMaxBigInteger()).isEqualTo(DEFAULT_MAX_BIG_INTEGER);
        assertThat(parameter.getMinBigDecimal()).isEqualTo(min);
        assertThat(parameter.getMaxBigDecimal()).isEqualTo(max);
        assertThat(parameter.getScaleBigDecimal()).isEqualTo(scale);
        assertThat(parameter.getRoundingModeBigDecimal()).isEqualTo(roundingMode);
        assertThat(parameter.getFromDate()).isEqualTo(DEFAULT_FROM_DATE);
        assertThat(parameter.getToDate()).isEqualTo(DEFAULT_TO_DATE);
    }

    @Test
    void shouldOverrideDateRangeValues() {
        // Arrange
        LocalDateTime fromDate = LocalDateTime.of(2020, 1, 1, 1, 1);
        LocalDateTime toDate = LocalDateTime.now();
        // Act
        RandomizerParameter parameter = new RandomizerParameter.Builder()
                .withDateRange(fromDate, toDate)
                .build();
        // Assert
        assertThat(parameter.getCollectionSize()).isEqualTo(DEFAULT_COLLECTION_SIZE);
        assertThat(parameter.getStringLength()).isEqualTo(DEFAULT_STRING_LENGTH);
        assertThat(parameter.getStringCharacters()).isEqualTo(DEFAULT_STRING_CHARACTERS);
        assertThat(parameter.getMinInteger()).isEqualTo(DEFAULT_MIN_INTEGER);
        assertThat(parameter.getMaxInteger()).isEqualTo(DEFAULT_MAX_INTEGER);
        assertThat(parameter.getMinDouble()).isEqualTo(DEFAULT_MIN_DOUBLE);
        assertThat(parameter.getMaxDouble()).isEqualTo(DEFAULT_MAX_DOUBLE);
        assertThat(parameter.getMinShort()).isEqualTo(DEFAULT_MIN_SHORT);
        assertThat(parameter.getMaxShort()).isEqualTo(DEFAULT_MAX_SHORT);
        assertThat(parameter.getMinLong()).isEqualTo(DEFAULT_MIN_LONG);
        assertThat(parameter.getMaxLong()).isEqualTo(DEFAULT_MAX_LONG);
        assertThat(parameter.getMinFloat()).isEqualTo(DEFAULT_MIN_FLOAT);
        assertThat(parameter.getMaxFloat()).isEqualTo(DEFAULT_MAX_FLOAT);
        assertThat(parameter.getMinByte()).isEqualTo(DEFAULT_MIN_BYTE);
        assertThat(parameter.getMaxByte()).isEqualTo(DEFAULT_MAX_BYE);
        assertThat(parameter.getMinBigInteger()).isEqualTo(DEFAULT_MIN_BIG_INTEGER);
        assertThat(parameter.getMaxBigInteger()).isEqualTo(DEFAULT_MAX_BIG_INTEGER);
        assertThat(parameter.getMinBigDecimal()).isEqualTo(DEFAULT_MIN_BIG_DECIMAL);
        assertThat(parameter.getMaxBigDecimal()).isEqualTo(DEFAULT_MAX_BIG_DECIMAL);
        assertThat(parameter.getScaleBigDecimal()).isEqualTo(DEFAULT_SCALE_BIG_DECIMAL);
        assertThat(parameter.getRoundingModeBigDecimal()).isEqualTo(DEFAULT_ROUNDING_MODE_BIG_DECIMAL);
        assertThat(parameter.getFromDate()).isEqualTo(fromDate);
        assertThat(parameter.getToDate()).isEqualTo(toDate);
    }


    @Test
    void shouldOverrideAllValues() {
        // Arrange
        int stringLength = 12;
        String stringCharacters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int collectionSize = 10;
        int minInteger = 2;
        int maxInteger = 50;
        double minDouble = 2.0;
        double maxDouble = 50.0;
        short minShort = 2;
        short maxShort = 50;
        long minLong = 20L;
        long maxLong = 50L;
        float minFloat = 2.0f;
        float maxFloat = 50.0f;
        byte minByte = 0;
        byte maxByte = 127;
        BigInteger minBigInteger = BigInteger.TWO;
        BigInteger maxBigInteger = BigInteger.valueOf(50L);
        BigDecimal minBigDecimal = BigDecimal.TWO;
        BigDecimal maxBigDecimal = BigDecimal.valueOf(50.0);
        int scaleBigDecimal = 4;
        RoundingMode roundingModeBigDecimal = RoundingMode.FLOOR;
        LocalDateTime fromDate = LocalDateTime.of(2020, 1, 1, 1, 1);
        LocalDateTime toDate = LocalDateTime.now();
        // Act
        RandomizerParameter parameter = new RandomizerParameter.Builder()
                .withCollection(collectionSize)
                .withString(stringLength, stringCharacters)
                .withInteger(minInteger, maxInteger)
                .withDouble(minDouble, maxDouble)
                .withShort(minShort, maxShort)
                .withLong(minLong, maxLong)
                .withFloat(minFloat, maxFloat)
                .withByte(minByte, maxByte)
                .withBigInteger(minBigInteger, maxBigInteger)
                .withBigDecimal(minBigDecimal, maxBigDecimal, scaleBigDecimal, roundingModeBigDecimal)
                .withDateRange(fromDate, toDate)
                .build();
        // Assert
        assertThat(parameter.getCollectionSize()).isEqualTo(collectionSize);
        assertThat(parameter.getStringLength()).isEqualTo(stringLength);
        assertThat(parameter.getStringCharacters()).isEqualTo(stringCharacters);
        assertThat(parameter.getMinInteger()).isEqualTo(minInteger);
        assertThat(parameter.getMaxInteger()).isEqualTo(maxInteger);
        assertThat(parameter.getMinDouble()).isEqualTo(minDouble);
        assertThat(parameter.getMaxDouble()).isEqualTo(maxDouble);
        assertThat(parameter.getMinShort()).isEqualTo(minShort);
        assertThat(parameter.getMaxShort()).isEqualTo(maxShort);
        assertThat(parameter.getMinLong()).isEqualTo(minLong);
        assertThat(parameter.getMaxLong()).isEqualTo(maxLong);
        assertThat(parameter.getMinFloat()).isEqualTo(minFloat);
        assertThat(parameter.getMaxFloat()).isEqualTo(maxFloat);
        assertThat(parameter.getMinByte()).isEqualTo(minByte);
        assertThat(parameter.getMaxByte()).isEqualTo(maxByte);
        assertThat(parameter.getMinBigInteger()).isEqualTo(minBigInteger);
        assertThat(parameter.getMaxBigInteger()).isEqualTo(maxBigInteger);
        assertThat(parameter.getMinBigDecimal()).isEqualTo(minBigDecimal);
        assertThat(parameter.getMaxBigDecimal()).isEqualTo(maxBigDecimal);
        assertThat(parameter.getScaleBigDecimal()).isEqualTo(scaleBigDecimal);
        assertThat(parameter.getRoundingModeBigDecimal()).isEqualTo(roundingModeBigDecimal);
        assertThat(parameter.getFromDate()).isEqualTo(fromDate);
        assertThat(parameter.getToDate()).isEqualTo(toDate);
    }

}
