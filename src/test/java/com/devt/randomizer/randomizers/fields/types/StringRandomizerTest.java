package com.devt.randomizer.randomizers.fields.types;

import com.devt.randomizer.randomizers.Randomizer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Random;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

class StringRandomizerTest {

    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
            + "abcdefghijklmnopqrstuvwxyz"
            + "0123456789"
            + "!@#$%^&*()-_=+[]{}|;:'\",./<>?";

    private Random random;

    @BeforeEach
    void setUp() {
        random = new Random();
    }

    @RepeatedTest(10)
    void shouldGenerateValue() {
        // Arrange
        int length = 10;
        // Act
        Randomizer<String> randomizer = new StringRandomizer(random, length, CHARACTERS);
        String output = randomizer.next();
        // Assert
        assertThat(output)
                .isNotNull()
                .hasSize(length)
                .matches("[a-zA-Z0-9!@#$%^&*()\\-_=+\\[\\]{}|;:'\",./<>?]*");
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4, 5, 10, 15, 20, 25, 50})
    void shouldGenerateValueWithCorrectLength(int length) {
        // Act
        Randomizer<String> randomizer = new StringRandomizer(random, length, CHARACTERS);
        String output = randomizer.next();
        // Assert
        assertThat(output)
                .isNotNull()
                .hasSize(length)
                .matches("[a-zA-Z0-9!@#$%^&*()\\-_=+\\[\\]{}|;:'\",./<>?]*");
    }

    @Test
    void shouldThrowIllegalArgumentExceptionWhenLengthIs0() {
        // Arrange
        int length = 0;
        // Act
        Throwable thrown = catchThrowable(() -> {
            Randomizer<String> randomizer = new StringRandomizer(random, length, CHARACTERS);
            randomizer.next();
        });
        // Assert
        assertThat(thrown)
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("String randomizer failed initializing, because length '0' must be greater than 0");
    }

    @Test
    void shouldThrowIllegalArgumentExceptionWhenLengthIsNegative() {
        // Arrange
        int length = -1;
        // Act
        Throwable thrown = catchThrowable(() -> {
            Randomizer<String> randomizer = new StringRandomizer(random, length, CHARACTERS);
            randomizer.next();
        });
        // Assert
        assertThat(thrown)
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("String randomizer failed initializing, because length '-1' must be greater than 0");
    }

    @Test
    void shouldThrowIllegalArgumentExceptionWhenCharactersIsNull() {
        // Arrange
        int length = 10;
        String characters = null;
        // Act
        Throwable thrown = catchThrowable(() -> {
            Randomizer<String> randomizer = new StringRandomizer(random, length, characters);
            randomizer.next();
        });
        // Assert
        assertThat(thrown)
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("String randomizer failed initializing, because characters must not be empty");
    }

    @Test
    void shouldThrowIllegalArgumentExceptionWhenCharactersIsBlank() {
        // Arrange
        int length = 10;
        String characters = "";
        // Act
        Throwable thrown = catchThrowable(() -> {
            Randomizer<String> randomizer = new StringRandomizer(random, length, characters);
            randomizer.next();
        });
        // Assert
        assertThat(thrown)
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("String randomizer failed initializing, because characters must not be empty");
    }

}
