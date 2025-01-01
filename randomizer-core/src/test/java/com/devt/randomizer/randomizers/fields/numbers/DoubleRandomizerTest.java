package com.devt.randomizer.randomizers.fields.numbers;

import com.devt.randomizer.randomizers.Randomizer;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

class DoubleRandomizerTest {

    @RepeatedTest(10)
    void shouldGenerateARandomValueBetweenMinAndMax() {
        // Arrange
        double min = 10.0;
        double max = 20.0;
        // Act
        Randomizer<Double> randomizer = new DoubleRandomizer(min, max);
        Double output = randomizer.next();
        // Assert
        assertThat(output)
                .isNotNull()
                .isBetween(min, max);
    }

    @Test
    void shouldGenerateExactlyANumberWhenMinIsToEqualToMax() {
        // Arrange
        double min = 10.0;
        double max = 10.0;
        // Act
        Randomizer<Double> randomizer = new DoubleRandomizer(min, max);
        Double output = randomizer.next();
        // Assert
        assertThat(output)
                .isNotNull()
                .isEqualTo(10.0);
    }

    @Test
    void shouldThrowIllegalArgumentExceptionWhenMinIsMoreThanMax() {
        // Arrange
        double min = 10.0;
        double max = 9.9;
        // Act
        Throwable thrown = catchThrowable(() -> {
            Randomizer<Double> randomizer = new DoubleRandomizer(min, max);
            randomizer.next();
        });
        // Assert
        assertThat(thrown)
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Double randomizer failed initializing, because min '10.0' should be less than or equal to max '9.9'");
    }

}
