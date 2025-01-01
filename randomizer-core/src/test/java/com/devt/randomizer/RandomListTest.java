package com.devt.randomizer;

import org.junit.jupiter.api.Test;

import java.util.List;

import static com.devt.randomizer.RandomizerParameterTest.DEFAULT_COLLECTION_SIZE;
import static com.devt.randomizer.RandomizerUtils.randomListOf;
import static org.assertj.core.api.Assertions.assertThat;

class RandomListTest {

    @Test
    void shouldGenerateRandomValue() {
        // Act
        List<String> output = randomListOf(String.class);
        // Assert
        assertThat(output)
                .isNotNull()
                .isNotEmpty()
                .hasSize(DEFAULT_COLLECTION_SIZE);
    }

}
