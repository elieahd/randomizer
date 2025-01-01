package com.devt.randomizer;

import org.junit.jupiter.api.Test;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;

import static com.devt.randomizer.RandomizerParameterTest.DEFAULT_FROM_DATE;
import static com.devt.randomizer.RandomizerParameterTest.DEFAULT_TO_DATE;
import static com.devt.randomizer.RandomizerUtils.random;
import static org.assertj.core.api.Assertions.assertThat;

class RandomZonedDateTimeTest {

    @Test
    void shouldGenerateRandomValue() {
        // Act
        ZonedDateTime output = random(ZonedDateTime.class);
        // Assert
        assertThat(output)
                .isNotNull()
                .isBetween(DEFAULT_FROM_DATE.atZone(ZoneOffset.UTC), DEFAULT_TO_DATE.atZone(ZoneOffset.UTC));
    }

}
