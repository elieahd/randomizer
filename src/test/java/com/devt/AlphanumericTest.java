package com.devt;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static com.devt.Randomizer.random;
import static com.devt.Randomizer.randomAlphanumeric;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

class AlphanumericTest {

    @RepeatedTest(10)
    void shouldGenerateAlphanumericOf12Characters() {
        // Act
        String output = randomAlphanumeric();
        // Assert
        assertThat(output)
                .isNotNull()
                .hasSize(12)
                .matches("[a-zA-Z0-9]*");
    }

    @RepeatedTest(10)
    void shouldGenerateRandomStringClass() {
        // Act
        String output = random(String.class);
        // Assert
        assertThat(output)
                .isNotNull()
                .hasSize(12)
                .matches("[a-zA-Z0-9]*");
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4, 5, 10, 15, 20, 25, 50})
    void shouldGenerateAlphanumeric(int length) {
        // Act
        String output = randomAlphanumeric(length);
        // Assert
        assertThat(output)
                .isNotNull()
                .hasSize(length)
                .matches("[a-zA-Z0-9]*");
    }

    @Test
    void shouldThrowIllegalArgumentExceptionWhenLengthIs0() {
        // Arrange
        int length = 0;
        // Act
        Throwable thrown = catchThrowable(() -> randomAlphanumeric(length));
        // Assert
        assertThat(thrown)
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Randomizing a string failed, length must be greater than 0");
    }

    @Test
    void shouldThrowIllegalArgumentExceptionWhenLengthIsNegative() {
        // Arrange
        int length = -1;
        // Act
        Throwable thrown = catchThrowable(() -> randomAlphanumeric(length));
        // Assert
        assertThat(thrown)
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Randomizing a string failed, length must be greater than 0");
    }

}
