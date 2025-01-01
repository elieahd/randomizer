package com.devt.randomizer;

import org.junit.jupiter.api.RepeatedTest;

import static com.devt.randomizer.RandomizerUtils.random;
import static org.assertj.core.api.Assertions.assertThat;

class RandomEnumTest {

    @RepeatedTest(10)
    void shouldGenerateRandomValue() {
        // Act
        Color output = random(Color.class);
        // Assert
        assertThat(output)
                .isNotNull()
                .isIn(Color.RED, Color.BLUE, Color.GREEN);
    }

    enum Color {
        RED, BLUE, GREEN
    }

}
