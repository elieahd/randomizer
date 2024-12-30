package com.devt.randomizer.randomizers.fields.numbers;

import com.devt.randomizer.randomizers.Randomizer;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

class LongRandomizerTest {

    @RepeatedTest(10)
    void shouldGenerateARandomValueBetweenMinAndMax() {
        // Arrange
        long min = 10;
        long max = 20;
        // Act
        Randomizer<Long> randomizer = new LongRandomizer(min, max);
        Long output = randomizer.next();
        // Assert
        assertThat(output)
                .isNotNull()
                .isBetween(min, max);
    }

    @Test
    void shouldGenerateExactlyANumberWhenMinIsToEqualToMax() {
        // Arrange
        long min = 10;
        long max = 10;
        // Act
        Randomizer<Long> randomizer = new LongRandomizer(min, max);
        Long output = randomizer.next();
        // Assert
        assertThat(output)
                .isNotNull()
                .isEqualTo(10);
    }

    @Test
    void shouldThrowIllegalArgumentExceptionWhenMinIsMoreThanMax() {
        // Arrange
        long min = 10;
        long max = 9;
        // Act
        Throwable thrown = catchThrowable(() -> {
            Randomizer<Long> randomizer = new LongRandomizer(min, max);
            randomizer.next();
        });
        // Assert
        assertThat(thrown)
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Long randomizer failed initializing, because min '10' should be less than or equal to max '9'");
    }
}
