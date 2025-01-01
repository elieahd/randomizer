package com.devt.randomizer;

import org.junit.jupiter.api.RepeatedTest;

import static com.devt.randomizer.RandomizerParameterTest.DEFAULT_MAX_INTEGER;
import static com.devt.randomizer.RandomizerParameterTest.DEFAULT_MIN_INTEGER;
import static com.devt.randomizer.RandomizerUtils.random;
import static org.assertj.core.api.Assertions.assertThat;

class RandomIntegerTest {

    @RepeatedTest(10)
    void shouldGenerateRandomValue() {
        // Act
        Integer output = random(Integer.class);
        // Assert
        assertThat(output)
                .isNotNull()
                .isBetween(DEFAULT_MIN_INTEGER, DEFAULT_MAX_INTEGER);
    }

    @RepeatedTest(10)
    void shouldGenerateRandomValueOfPrimitive() {
        // Act
        int output = random(int.class);
        // Assert
        assertThat(output).isBetween(DEFAULT_MIN_INTEGER, DEFAULT_MAX_INTEGER);
    }

}