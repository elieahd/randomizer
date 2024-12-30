package com.devt.randomizer.randomizers.fields.numbers;

import com.devt.randomizer.randomizers.Randomizer;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

class ShortRandomizerTest {

    @RepeatedTest(10)
    void shouldGenerateARandomValueBetweenMinAndMax() {
        // Arrange
        short min = 10;
        short max = 20;
        // Act
        Randomizer<Short> randomizer = new ShortRandomizer(min, max);
        Short output = randomizer.next();
        // Assert
        assertThat(output)
                .isNotNull()
                .isBetween(min, max);
    }

    @Test
    void shouldGenerateExactlyANumberWhenMinIsToEqualToMax() {
        // Arrange
        short min = 10;
        short max = 10;
        // Act
        Randomizer<Short> randomizer = new ShortRandomizer(min, max);
        Short output = randomizer.next();
        // Assert
        assertThat(output)
                .isNotNull()
                .isEqualTo((short) 10);
    }

    @Test
    void shouldThrowIllegalArgumentExceptionWhenMinIsMoreThanMax() {
        // Arrange
        short min = 10;
        short max = 9;
        // Act
        Throwable thrown = catchThrowable(() -> {
            Randomizer<Short> randomizer = new ShortRandomizer(min, max);
            randomizer.next();
        });
        // Assert
        assertThat(thrown)
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Short randomizer failed initializing, because min '10' should be less than or equal to max '9'");
    }

}
