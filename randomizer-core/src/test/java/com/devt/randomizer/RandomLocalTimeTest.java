package com.devt.randomizer;

import org.junit.jupiter.api.Test;

import java.time.LocalTime;

import static com.devt.randomizer.RandomizerParameterTest.DEFAULT_FROM_DATE;
import static com.devt.randomizer.RandomizerParameterTest.DEFAULT_TO_DATE;
import static com.devt.randomizer.RandomizerUtils.random;
import static org.assertj.core.api.Assertions.assertThat;

class RandomLocalTimeTest {

    @Test
    void shouldGenerateRandomValue() {
        // Act
        LocalTime output = random(LocalTime.class);
        // Assert
        assertThat(output)
                .isNotNull()
                .isBetween(DEFAULT_FROM_DATE.toLocalTime(), DEFAULT_TO_DATE.toLocalTime());
    }

}
