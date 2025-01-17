package com.devt.randomizer.randomizers.fields.numbers;

import com.devt.randomizer.randomizers.Randomizer;

import java.math.BigInteger;
import java.util.concurrent.ThreadLocalRandom;

public class BigIntegerRandomizer implements Randomizer<BigInteger> {

    private final BigInteger min;
    private final BigInteger max;

    public BigIntegerRandomizer(BigInteger min, BigInteger max) {
        if (min.compareTo(max) > 0) {
            throw new IllegalArgumentException(
                    "BigInteger randomizer failed initializing, because min '%s' should be less than or equal to max '%s'"
                            .formatted(min, max)
            );
        }
        this.min = min;
        this.max = max;
    }

    @Override
    public BigInteger next() {
        if (min.compareTo(max) == 0) {
            return min;
        }
        BigInteger range = max.subtract(min).add(BigInteger.ONE);
        int bitLength = range.bitLength();
        BigInteger randomBigInt;
        do {
            randomBigInt = new BigInteger(bitLength, ThreadLocalRandom.current());
        } while (randomBigInt.compareTo(range) >= 0);
        return randomBigInt.add(min);
    }

}
