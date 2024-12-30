package com.devt.randomizer;

import org.junit.jupiter.api.Test;

import java.time.OffsetTime;
import java.time.ZoneOffset;

import static com.devt.randomizer.RandomizerParameterTest.DEFAULT_FROM_DATE;
import static com.devt.randomizer.RandomizerParameterTest.DEFAULT_TO_DATE;
import static com.devt.randomizer.RandomizerUtils.random;
import static org.assertj.core.api.Assertions.assertThat;

class RandomOffsetTimeTest {

    @Test
    void shouldGenerateRandomValue() {
        // Act
        OffsetTime output = random(OffsetTime.class);
        // Assert
        assertThat(output)
                .isNotNull()
                .isBetween(DEFAULT_FROM_DATE.toLocalTime().atOffset(ZoneOffset.UTC), DEFAULT_TO_DATE.toLocalTime().atOffset(ZoneOffset.UTC));
    }

}
