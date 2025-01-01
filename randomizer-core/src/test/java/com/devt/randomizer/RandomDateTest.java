package com.devt.randomizer;

import org.junit.jupiter.api.Test;

import java.time.ZoneOffset;
import java.util.Date;

import static com.devt.randomizer.RandomizerParameterTest.DEFAULT_FROM_DATE;
import static com.devt.randomizer.RandomizerParameterTest.DEFAULT_TO_DATE;
import static com.devt.randomizer.RandomizerUtils.random;
import static org.assertj.core.api.Assertions.assertThat;

class RandomDateTest {

    @Test
    void shouldGenerateRandomValue() {
        // Act
        Date output = random(Date.class);
        // Assert
        assertThat(output)
                .isNotNull()
                .isBetween(DEFAULT_FROM_DATE.toInstant(ZoneOffset.UTC), DEFAULT_TO_DATE.toInstant(ZoneOffset.UTC));
    }

}
