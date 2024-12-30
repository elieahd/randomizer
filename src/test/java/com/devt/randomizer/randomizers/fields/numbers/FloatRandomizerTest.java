package com.devt.randomizer.randomizers.fields.numbers;

import com.devt.randomizer.randomizers.Randomizer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

class FloatRandomizerTest {

    private Random random;

    @BeforeEach
    void setUp() {
        random = new Random();
    }

    @RepeatedTest(10)
    void shouldGenerateARandomValueBetweenMinAndMax() {
        // Arrange
        float min = 10f;
        float max = 20f;
        // Act
        Randomizer<Float> randomizer = new FloatRandomizer(random, min, max);
        Float output = randomizer.next();
        // Assert
        assertThat(output)
                .isNotNull()
                .isBetween(min, max);
    }

    @Test
    void shouldGenerateExactlyANumberWhenMinIsToEqualToMax() {
        // Arrange
        float min = 10f;
        float max = 10f;
        // Act
        Randomizer<Float> randomizer = new FloatRandomizer(random, min, max);
        Float output = randomizer.next();
        // Assert
        assertThat(output)
                .isNotNull()
                .isEqualTo(10f);
    }

    @Test
    void shouldThrowIllegalArgumentExceptionWhenMinIsMoreThanMax() {
        // Arrange
        float min = 10.0f;
        float max = 9.9f;
        // Act
        Throwable thrown = catchThrowable(() -> {
            Randomizer<Float> randomizer = new FloatRandomizer(random, min, max);
            randomizer.next();
        });
        // Assert
        assertThat(thrown)
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Float randomizer failed initializing, because min '10.0' should be less than or equal to max '9.9'");
    }

}
