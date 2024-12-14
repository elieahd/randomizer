package com.devt;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static com.devt.Randomizer.random;
import static com.devt.Randomizer.randomDouble;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

class DoubleTest {

    @RepeatedTest(20)
    void shouldGenerateRandomDoubleClass() {
        // Act
        Double output = random(Double.class);
        // Assert
        assertThat(output)
                .isNotNull()
                .isBetween(0.0, 100.0);
    }

    @RepeatedTest(20)
    void shouldGenerateRandomOfPrimitiveDoubleClass() {
        // Act
        double output = random(double.class);
        // Assert
        assertThat(output).isBetween(0.0, 100.0);
    }

    @RepeatedTest(20)
    void shouldGenerateDoubleBetween0And100() {
        // Act
        Double output = randomDouble();
        // Assert
        assertThat(output)
                .isNotNull()
                .isBetween(0.0, 100.0);
    }

    @RepeatedTest(10)
    void shouldGenerateDoubleBetween2Numbers() {
        // Arrange
        double min = 10.0;
        double max = 20.0;
        // Act
        Double output = randomDouble(min, max);
        // Assert
        assertThat(output)
                .isNotNull()
                .isBetween(min, max);
    }

    @Test
    void shouldGenerateExactlyDouble() {
        // Arrange
        double min = 10.0;
        double max = 10.0;
        // Act
        Double output = randomDouble(min, max);
        // Assert
        assertThat(output)
                .isNotNull()
                .isEqualTo(10.0);
    }

    @Test
    void shouldThrowIllegalArgumentExceptionWhenMinIsMoreThanMax() {
        // Arrange
        double min = 20.0;
        double max = 19.9;
        // Act
        Throwable thrown = catchThrowable(() -> randomDouble(min, max));
        // Assert
        assertThat(thrown)
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Randomizing a double between failed, because min '20.0' should be greater than max '19.9'");
    }

}
