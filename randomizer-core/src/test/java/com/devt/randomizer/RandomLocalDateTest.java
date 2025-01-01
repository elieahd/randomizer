package com.devt.randomizer;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static com.devt.randomizer.RandomizerParameterTest.DEFAULT_FROM_DATE;
import static com.devt.randomizer.RandomizerParameterTest.DEFAULT_TO_DATE;
import static com.devt.randomizer.RandomizerUtils.random;
import static org.assertj.core.api.Assertions.assertThat;

class RandomLocalDateTest {

    @Test
    void shouldGenerateRandomValue() {
        // Act
        LocalDate output = random(LocalDate.class);
        // Assert
        assertThat(output)
                .isNotNull()
                .isBetween(DEFAULT_FROM_DATE.toLocalDate(), DEFAULT_TO_DATE.toLocalDate());
    }

}
