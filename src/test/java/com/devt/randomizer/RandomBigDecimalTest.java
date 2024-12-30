package com.devt.randomizer;

import org.junit.jupiter.api.RepeatedTest;

import java.math.BigDecimal;

import static com.devt.randomizer.RandomizerParameterTest.DEFAULT_MAX_BIG_DECIMAL;
import static com.devt.randomizer.RandomizerParameterTest.DEFAULT_MIN_BIG_DECIMAL;
import static com.devt.randomizer.RandomizerUtils.random;
import static org.assertj.core.api.Assertions.assertThat;

class RandomBigDecimalTest {

    @RepeatedTest(10)
    void shouldGenerateRandomValue() {
        // Act
        BigDecimal output = random(BigDecimal.class);
        // Assert
        assertThat(output)
                .isNotNull()
                .isBetween(DEFAULT_MIN_BIG_DECIMAL, DEFAULT_MAX_BIG_DECIMAL);
    }

}
