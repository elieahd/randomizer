package com.devt.randomizer.randomizers.fields.numbers;

import com.devt.randomizer.randomizers.Randomizer;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.concurrent.ThreadLocalRandom;

public class BigDecimalRandomizer implements Randomizer<BigDecimal> {

    private final BigDecimal min;
    private final BigDecimal max;
    private final int scale;
    private final RoundingMode roundingMode;

    public BigDecimalRandomizer(BigDecimal min,
                                BigDecimal max,
                                int scale,
                                RoundingMode roundingMode) {
        if (min.compareTo(max) > 0) {
            throw new IllegalArgumentException(
                    "BigDecimal randomizer failed initializing, because min '%s' should be less than or equal to max '%s'"
                            .formatted(min, max)
            );
        }
        this.min = min;
        this.max = max;
        this.scale = scale;
        this.roundingMode = roundingMode;
    }

    @Override
    public BigDecimal next() {
        if (min.compareTo(max) == 0) {
            return min;
        }
        BigDecimal range = max.subtract(min);
        BigDecimal randomFactor = BigDecimal.valueOf(ThreadLocalRandom.current().nextDouble());
        return min.add(range.multiply(randomFactor))
                .setScale(scale, roundingMode);
    }

}
