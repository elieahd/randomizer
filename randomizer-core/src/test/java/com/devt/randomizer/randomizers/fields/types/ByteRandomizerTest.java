package com.devt.randomizer.randomizers.fields.types;

import com.devt.randomizer.randomizers.Randomizer;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

class ByteRandomizerTest {

    @RepeatedTest(10)
    void shouldGenerateARandomValueBetweenMinAndMax() {
        // Arrange
        byte min = 10;
        byte max = 50;
        // Act
        Randomizer<Byte> randomizer = new ByteRandomizer(min, max);
        Byte output = randomizer.next();
        // Assert
        assertThat(output)
                .isNotNull()
                .isBetween(min, max);
    }

    @Test
    void shouldGenerateExactlyANumberWhenMinIsToEqualToMax() {
        // Arrange
        byte min = 10;
        byte max = 10;
        // Act
        Randomizer<Byte> randomizer = new ByteRandomizer(min, max);
        Byte output = randomizer.next();
        // Assert
        assertThat(output)
                .isNotNull()
                .isEqualTo((byte) 10);
    }

    @Test
    void shouldThrowIllegalArgumentExceptionWhenMinIsMoreThanMax() {
        // Arrange
        byte min = 10;
        byte max = 9;
        // Act
        Throwable thrown = catchThrowable(() -> {
            Randomizer<Byte> randomizer = new ByteRandomizer(min, max);
            randomizer.next();
        });
        // Assert
        assertThat(thrown)
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Byte randomizer failed initializing, because min '10' should be less than or equal to max '9'");
    }

}
