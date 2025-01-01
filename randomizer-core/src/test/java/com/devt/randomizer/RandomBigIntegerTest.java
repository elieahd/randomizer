package com.devt.randomizer;

import org.junit.jupiter.api.RepeatedTest;

import java.math.BigInteger;

import static com.devt.randomizer.RandomizerParameterTest.DEFAULT_MAX_BIG_INTEGER;
import static com.devt.randomizer.RandomizerParameterTest.DEFAULT_MIN_BIG_INTEGER;
import static com.devt.randomizer.RandomizerUtils.random;
import static org.assertj.core.api.Assertions.assertThat;

class RandomBigIntegerTest {

    @RepeatedTest(10)
    void shouldGenerateRandomValue() {
        // Act
        BigInteger output = random(BigInteger.class);
        // Assert
        assertThat(output)
                .isNotNull()
                .isBetween(DEFAULT_MIN_BIG_INTEGER, DEFAULT_MAX_BIG_INTEGER);
    }

}
