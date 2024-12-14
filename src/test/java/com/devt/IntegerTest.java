package com.devt;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static com.devt.Randomizer.randomInteger;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

class IntegerTest {

    @RepeatedTest(20)
    void shouldGenerateIntegerBetween0And100() {
        // Act
        Integer output = randomInteger();
        // Assert
        assertThat(output)
                .isNotNull()
                .isBetween(0, 100);
    }

    @RepeatedTest(10)
    void shouldGenerateIntegerBetween2Numbers() {
        // Arrange
        int min = 10;
        int max = 20;
        // Act
        Integer output = randomInteger(min, max);
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
        Integer output = randomInteger(min, max);
        // Assert
        assertThat(output)
                .isNotNull()
                .isEqualTo(10);
    }

    @Test
    void shouldThrowIllegalArgumentExceptionWhenMinIsMoreThanMax() {
        // Arrange
        int min = 20;
        int max = 19;
        // Act
        Throwable thrown = catchThrowable(() -> randomInteger(min, max));
        // Assert
        assertThat(thrown).isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Randomizing an integer between failed, because min '20' should be greater than max '19'");
    }

}
