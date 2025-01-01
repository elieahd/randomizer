package com.devt.randomizer;

import org.junit.jupiter.api.Test;

import java.util.Set;

import static com.devt.randomizer.RandomizerParameterTest.DEFAULT_COLLECTION_SIZE;
import static com.devt.randomizer.RandomizerUtils.randomSetOf;
import static org.assertj.core.api.Assertions.assertThat;

class RandomSetTest {

    @Test
    void shouldGenerateRandomValue() {
        // Act
        Set<String> output = randomSetOf(String.class);
        // Assert
        assertThat(output)
                .isNotNull()
                .isNotEmpty()
                .hasSize(DEFAULT_COLLECTION_SIZE);
    }

}
