package com.devt.randomizer;

import org.junit.jupiter.api.RepeatedTest;

import static com.devt.randomizer.RandomizerParameterTest.DEFAULT_MAX_SHORT;
import static com.devt.randomizer.RandomizerParameterTest.DEFAULT_MIN_SHORT;
import static com.devt.randomizer.RandomizerUtils.random;
import static org.assertj.core.api.Assertions.assertThat;

class RandomShortTest {

    @RepeatedTest(10)
    void shouldGenerateRandomValue() {
        // Act
        Short output = random(Short.class);
        // Assert
        assertThat(output)
                .isNotNull()
                .isBetween(DEFAULT_MIN_SHORT, DEFAULT_MAX_SHORT);
    }

    @RepeatedTest(10)
    void shouldGenerateRandomValueOfPrimitive() {
        // Act
        short output = random(short.class);
        // Assert
        assertThat(output).isBetween(DEFAULT_MIN_SHORT, DEFAULT_MAX_SHORT);
    }

}
