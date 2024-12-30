package com.devt.randomizer;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.time.LocalDateTime;

public class RandomizerParameter {

    private final int stringLength;
    private final String stringCharacters;
    private final int collectionSize;
    private final int minInteger;
    private final int maxInteger;
    private final double minDouble;
    private final double maxDouble;
    private final short minShort;
    private final short maxShort;
    private final long minLong;
    private final long maxLong;
    private final float minFloat;
    private final float maxFloat;
    private final byte minByte;
    private final byte maxByte;
    private final BigInteger minBigInteger;
    private final BigInteger maxBigInteger;
    private final BigDecimal minBigDecimal;
    private final BigDecimal maxBigDecimal;
    private final int scaleBigDecimal;
    private final RoundingMode roundingModeBigDecimal;
    private final LocalDateTime fromDate;
    private final LocalDateTime toDate;

    private RandomizerParameter(Builder builder) {
        this.stringLength = builder.stringLength;
        this.stringCharacters = builder.stringCharacters;
        this.collectionSize = builder.collectionSize;
        this.minInteger = builder.minInteger;
        this.maxInteger = builder.maxInteger;
        this.minDouble = builder.minDouble;
        this.maxDouble = builder.maxDouble;
        this.minShort = builder.minShort;
        this.maxShort = builder.maxShort;
        this.minLong = builder.minLong;
        this.maxLong = builder.maxLong;
        this.minFloat = builder.minFloat;
        this.maxFloat = builder.maxFloat;
        this.minByte = builder.minByte;
        this.maxByte = builder.maxByte;
        this.minBigInteger = builder.minBigInteger;
        this.maxBigInteger = builder.maxBigInteger;
        this.minBigDecimal = builder.minBigDecimal;
        this.maxBigDecimal = builder.maxBigDecimal;
        this.scaleBigDecimal = builder.scaleBigDecimal;
        this.roundingModeBigDecimal = builder.roundingModeBigDecimal;
        this.fromDate = builder.fromDate;
        this.toDate = builder.toDate;
    }

    public RandomizerParameter() {
        this(new Builder());
    }

    public int getStringLength() {
        return stringLength;
    }

    public String getStringCharacters() {
        return stringCharacters;
    }

    public int getCollectionSize() {
        return collectionSize;
    }

    public int getMinInteger() {
        return minInteger;
    }

    public int getMaxInteger() {
        return maxInteger;
    }

    public double getMinDouble() {
        return minDouble;
    }

    public double getMaxDouble() {
        return maxDouble;
    }

    public short getMinShort() {
        return minShort;
    }

    public short getMaxShort() {
        return maxShort;
    }

    public long getMinLong() {
        return minLong;
    }

    public long getMaxLong() {
        return maxLong;
    }

    public float getMinFloat() {
        return minFloat;
    }

    public float getMaxFloat() {
        return maxFloat;
    }

    public byte getMinByte() {
        return minByte;
    }

    public byte getMaxByte() {
        return maxByte;
    }

    public BigInteger getMinBigInteger() {
        return minBigInteger;
    }

    public BigInteger getMaxBigInteger() {
        return maxBigInteger;
    }

    public BigDecimal getMinBigDecimal() {
        return minBigDecimal;
    }

    public BigDecimal getMaxBigDecimal() {
        return maxBigDecimal;
    }

    public int getScaleBigDecimal() {
        return scaleBigDecimal;
    }

    public RoundingMode getRoundingModeBigDecimal() {
        return roundingModeBigDecimal;
    }

    public LocalDateTime getFromDate() {
        return fromDate;
    }

    public LocalDateTime getToDate() {
        return toDate;
    }

    public static class Builder {

        private int stringLength = 10;
        private String stringCharacters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "abcdefghijklmnopqrstuvwxyz"
                + "0123456789"
                + "!@#$%^&*()-_=+[]{}|;:'\",./<>?";
        private int collectionSize = 5;
        private int minInteger = 0;
        private int maxInteger = 100;
        private double minDouble = 0.0;
        private double maxDouble = 100.0;
        private short minShort = 0;
        private short maxShort = 100;
        private long minLong = 0L;
        private long maxLong = 100L;
        private float minFloat = 0.0f;
        private float maxFloat = 100.0f;
        private byte minByte = -128;
        private byte maxByte = 127;
        private BigInteger minBigInteger = BigInteger.ZERO;
        private BigInteger maxBigInteger = BigInteger.valueOf(100L);
        private BigDecimal minBigDecimal = BigDecimal.ZERO;
        private BigDecimal maxBigDecimal = BigDecimal.valueOf(100.0);
        private int scaleBigDecimal = 2;
        private RoundingMode roundingModeBigDecimal = RoundingMode.HALF_UP;
        private LocalDateTime fromDate = LocalDateTime.of(2000, 1, 1, 0, 0, 0);
        private LocalDateTime toDate = LocalDateTime.of(2030, 12, 31, 23, 59, 59);

        public Builder withDateRange(LocalDateTime fromDate, LocalDateTime toDate) {
            this.fromDate = fromDate;
            this.toDate = toDate;
            return this;
        }

        public Builder withBigDecimal(BigDecimal minBigDecimal,
                                      BigDecimal maxBigDecimal,
                                      int scaleBigDecimal,
                                      RoundingMode roundingModeBigDecimal) {
            this.minBigDecimal = minBigDecimal;
            this.maxBigDecimal = maxBigDecimal;
            this.scaleBigDecimal = scaleBigDecimal;
            this.roundingModeBigDecimal = roundingModeBigDecimal;
            return this;
        }

        public Builder withBigInteger(BigInteger min, BigInteger max) {
            this.minBigInteger = min;
            this.maxBigInteger = max;
            return this;
        }

        public Builder withByte(byte min, byte max) {
            this.minByte = min;
            this.maxByte = max;
            return this;
        }

        public Builder withShort(short min, short max) {
            this.minShort = min;
            this.maxShort = max;
            return this;
        }

        public Builder withLong(long min, long max) {
            this.minLong = min;
            this.maxLong = max;
            return this;
        }

        public Builder withFloat(float min, float max) {
            this.minFloat = min;
            this.maxFloat = max;
            return this;
        }

        public Builder withInteger(int min, int max) {
            this.minInteger = min;
            this.maxInteger = max;
            return this;
        }

        public Builder withDouble(double min, double max) {
            this.minDouble = min;
            this.maxDouble = max;
            return this;
        }

        public Builder withString(int length, String characters) {
            this.stringLength = length;
            this.stringCharacters = characters;
            return this;
        }

        public Builder withCollection(int size) {
            this.collectionSize = size;
            return this;
        }

        public RandomizerParameter build() {
            return new RandomizerParameter(this);
        }
    }

}
