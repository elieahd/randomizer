package com.devt.randomizer;

import org.junit.jupiter.api.RepeatedTest;

import static com.devt.randomizer.RandomizerParameterTest.DEFAULT_MAX_FLOAT;
import static com.devt.randomizer.RandomizerParameterTest.DEFAULT_MIN_FLOAT;
import static com.devt.randomizer.RandomizerUtils.random;
import static org.assertj.core.api.Assertions.assertThat;

class RandomFloatTest {

    @RepeatedTest(10)
    void shouldGenerateRandomValue() {
        // Act
        Float output = random(Float.class);
        // Assert
        assertThat(output)
                .isNotNull()
                .isBetween(DEFAULT_MIN_FLOAT, DEFAULT_MAX_FLOAT);
    }

    @RepeatedTest(10)
    void shouldGenerateRandomValueOfPrimitive() {
        // Act
        float output = random(float.class);
        // Assert
        assertThat(output).isBetween(DEFAULT_MIN_FLOAT, DEFAULT_MAX_FLOAT);
    }

}