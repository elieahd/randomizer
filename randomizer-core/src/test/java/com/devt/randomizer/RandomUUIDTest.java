package com.devt.randomizer;

import org.junit.jupiter.api.RepeatedTest;

import java.util.UUID;

import static com.devt.randomizer.RandomizerUtils.random;
import static org.assertj.core.api.Assertions.assertThat;

class RandomUUIDTest {

    @RepeatedTest(10)
    void shouldGenerateRandomValue() {
        // Act
        UUID output = random(UUID.class);
        // Assert
        assertThat(output.toString())
                .isNotNull()
                .matches("^[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}$");
    }

}
