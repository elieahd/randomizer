package com.devt.randomizer;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

import static com.devt.randomizer.RandomizerParameterTest.DEFAULT_COLLECTION_SIZE;
import static com.devt.randomizer.RandomizerUtils.randomStreamOf;
import static org.assertj.core.api.Assertions.assertThat;

class RandomStreamTest {

    @Test
    void shouldGenerateRandomValue() {
        // Act
        Stream<String> output = randomStreamOf(String.class);
        // Assert
        assertThat(output)
                .isNotNull()
                .isNotEmpty()
                .hasSize(DEFAULT_COLLECTION_SIZE);
    }

}
