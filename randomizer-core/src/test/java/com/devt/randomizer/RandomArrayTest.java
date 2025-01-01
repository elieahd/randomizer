package com.devt.randomizer;

import org.junit.jupiter.api.Test;

import static com.devt.randomizer.RandomizerParameterTest.DEFAULT_COLLECTION_SIZE;
import static com.devt.randomizer.RandomizerUtils.randomArrayOf;
import static org.assertj.core.api.Assertions.assertThat;

class RandomArrayTest {

    @Test
    void shouldGenerateRandomValue() {
        // Act
        String[] output = randomArrayOf(String.class);
        // Assert
        assertThat(output)
                .isNotNull()
                .isNotEmpty()
                .hasSize(DEFAULT_COLLECTION_SIZE);
    }

}
