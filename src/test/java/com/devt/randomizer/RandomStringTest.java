package com.devt.randomizer;

import org.junit.jupiter.api.RepeatedTest;

import static com.devt.randomizer.RandomizerUtils.random;
import static org.assertj.core.api.Assertions.assertThat;

class RandomStringTest {

    @RepeatedTest(10)
    void shouldGenerateRandomValue() {
        // Act
        String output = random(String.class);
        // Assert
        assertThat(output)
                .isNotNull()
                .hasSize(10)
                .matches("[a-zA-Z0-9!@#$%^&*()\\-_=+\\[\\]{}|;:'\",./<>?]*");
    }

}
