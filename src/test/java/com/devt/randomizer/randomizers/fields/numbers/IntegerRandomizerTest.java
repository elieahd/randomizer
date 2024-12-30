package com.devt.randomizer.randomizers.fields.numbers;

import com.devt.randomizer.randomizers.Randomizer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

class IntegerRandomizerTest {

    private Random random;

    @BeforeEach
    void setUp() {
        random = new Random();
    }

    @RepeatedTest(10)
    void shouldGenerateIntegerBetween2Numbers() {
        // Arrange
        int min = 10;
        int max = 20;
        // Act
        Randomizer<Integer> randomizer = new IntegerRandomizer(random, min, max);
        Integer output = randomizer.next();
        // Assert
        assertThat(output)
                .isNotNull()
                .isBetween(min, max);
    }

    @Test
    void shouldGenerateExactlyInteger() {
        // Arrange
        int min = 10;
        int max = 10;
        // Act
        Randomizer<Integer> randomizer = new IntegerRandomizer(random, min, max);
        Integer output = randomizer.next();
        // Assert
        assertThat(output)
                .isNotNull()
                .isEqualTo(10);
    }

    @Test
    void shouldThrowIllegalArgumentExceptionWhenMinIsMoreThanMax() {
        // Arrange
        int min = 10;
        int max = 9;
        // Act
        Throwable thrown = catchThrowable(() -> {
            Randomizer<Integer> randomizer = new IntegerRandomizer(random, min, max);
            randomizer.next();
        });
        // Assert
        assertThat(thrown)
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Integer randomizer failed initializing, because min '10' should be less than or equal to max '9'");
    }

}
