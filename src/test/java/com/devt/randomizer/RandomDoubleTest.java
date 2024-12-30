package com.devt.randomizer;

import org.junit.jupiter.api.RepeatedTest;

import static com.devt.randomizer.RandomizerParameterTest.DEFAULT_MAX_DOUBLE;
import static com.devt.randomizer.RandomizerParameterTest.DEFAULT_MIN_DOUBLE;
import static com.devt.randomizer.RandomizerUtils.random;
import static org.assertj.core.api.Assertions.assertThat;

class RandomDoubleTest {

    @RepeatedTest(10)
    void shouldGenerateRandomValue() {
        // Act
        Double output = random(Double.class);
        // Assert
        assertThat(output)
                .isNotNull()
                .isBetween(DEFAULT_MIN_DOUBLE, DEFAULT_MAX_DOUBLE);
    }

    @RepeatedTest(10)
    void shouldGenerateRandomValueOfPrimitive() {
        // Act
        double output = random(double.class);
        // Assert
        assertThat(output).isBetween(DEFAULT_MIN_DOUBLE, DEFAULT_MAX_DOUBLE);
    }

}