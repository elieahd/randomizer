package com.devt.randomizer;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static com.devt.randomizer.RandomizerParameterTest.DEFAULT_FROM_DATE;
import static com.devt.randomizer.RandomizerParameterTest.DEFAULT_TO_DATE;
import static com.devt.randomizer.RandomizerUtils.random;
import static org.assertj.core.api.Assertions.assertThat;

class RandomLocalDateTimeTest {

    @Test
    void shouldGenerateRandomValue() {
        // Act
        LocalDateTime output = random(LocalDateTime.class);
        // Assert
        assertThat(output)
                .isNotNull()
                .isBetween(DEFAULT_FROM_DATE, DEFAULT_TO_DATE);
    }

}