package com.devt.randomizer;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static com.devt.randomizer.RandomizerParameterTest.DEFAULT_COLLECTION_SIZE;
import static com.devt.randomizer.RandomizerUtils.randomMapOf;
import static org.assertj.core.api.Assertions.assertThat;

class RandomMapTest {

    @Test
    void shouldGenerateRandomValue() {
        // Act
        Map<Integer, String> output = randomMapOf(Integer.class, String.class);
        // Assert
        assertThat(output)
                .isNotNull()
                .isNotEmpty()
                .hasSize(DEFAULT_COLLECTION_SIZE);
    }

}
