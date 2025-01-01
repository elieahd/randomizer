package com.devt.randomizer;

import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;

import static com.devt.randomizer.RandomizerParameterTest.DEFAULT_FROM_DATE;
import static com.devt.randomizer.RandomizerParameterTest.DEFAULT_TO_DATE;
import static com.devt.randomizer.RandomizerUtils.random;
import static org.assertj.core.api.Assertions.assertThat;

class RandomOffsetDateTimeTest {

    @Test
    void shouldGenerateRandomValue() {
        // Act
        OffsetDateTime output = random(OffsetDateTime.class);
        // Assert
        assertThat(output)
                .isNotNull()
                .isBetween(DEFAULT_FROM_DATE.atOffset(ZoneOffset.UTC), DEFAULT_TO_DATE.atOffset(ZoneOffset.UTC));
    }

}
