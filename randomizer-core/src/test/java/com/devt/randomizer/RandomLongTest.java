package com.devt.randomizer;

import org.junit.jupiter.api.RepeatedTest;

import static com.devt.randomizer.RandomizerParameterTest.DEFAULT_MAX_LONG;
import static com.devt.randomizer.RandomizerParameterTest.DEFAULT_MIN_LONG;
import static com.devt.randomizer.RandomizerUtils.random;
import static org.assertj.core.api.Assertions.assertThat;

class RandomLongTest {

    @RepeatedTest(10)
    void shouldGenerateRandomValue() {
        // Act
        Long output = random(Long.class);
        // Assert
        assertThat(output)
                .isNotNull()
                .isBetween(DEFAULT_MIN_LONG, DEFAULT_MAX_LONG);
    }

    @RepeatedTest(10)
    void shouldGenerateRandomValueOfPrimitive() {
        // Act
        long output = random(long.class);
        // Assert
        assertThat(output).isBetween(DEFAULT_MIN_LONG, DEFAULT_MAX_LONG);
    }

}