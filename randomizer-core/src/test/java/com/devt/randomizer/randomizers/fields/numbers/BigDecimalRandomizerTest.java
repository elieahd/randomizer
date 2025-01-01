package com.devt.randomizer.randomizers.fields.numbers;

import com.devt.randomizer.randomizers.Randomizer;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

class BigDecimalRandomizerTest {

    @RepeatedTest(10)
    void shouldGenerateARandomValueBetweenMinAndMax() {
        // Arrange
        BigDecimal min = BigDecimal.ZERO;
        BigDecimal max = BigDecimal.valueOf(100);
        int scale = 2;
        RoundingMode roundingMode = RoundingMode.HALF_UP;
        // Act
        Randomizer<BigDecimal> randomizer = new BigDecimalRandomizer(min, max, scale, roundingMode);
        BigDecimal output = randomizer.next();
        // Assert
        assertThat(output)
                .isNotNull()
                .isBetween(min, max)
                .satisfies(value -> {
                    BigDecimal expectedRounded = value.setScale(scale, roundingMode);
                    assertThat(value).isEqualByComparingTo(expectedRounded);
                });
    }

    @Test
    void shouldGenerateExactlyANumberWhenMinIsToEqualToMax() {
        // Arrange
        BigDecimal min = BigDecimal.TEN;
        BigDecimal max = BigDecimal.TEN;
        int scale = 2;
        RoundingMode roundingMode = RoundingMode.HALF_UP;
        // Act
        Randomizer<BigDecimal> randomizer = new BigDecimalRandomizer(min, max, scale, roundingMode);
        BigDecimal output = randomizer.next();
        // Assert
        assertThat(output)
                .isNotNull()
                .isEqualTo(BigDecimal.TEN);
    }

    @Test
    void shouldThrowIllegalArgumentExceptionWhenMinIsMoreThanMax() {
        // Arrange
        BigDecimal min = BigDecimal.valueOf(10);
        BigDecimal max = BigDecimal.valueOf(9);
        int scale = 2;
        RoundingMode roundingMode = RoundingMode.HALF_UP;
        // Act
        Throwable thrown = catchThrowable(() -> {
            Randomizer<BigDecimal> randomizer = new BigDecimalRandomizer(min, max, scale, roundingMode);
            randomizer.next();
        });
        // Assert
        assertThat(thrown)
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("BigDecimal randomizer failed initializing, because min '10' should be less than or equal to max '9'");
    }

}
