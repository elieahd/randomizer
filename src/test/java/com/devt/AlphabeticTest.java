package com.devt;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static com.devt.Randomizer.randomAlphabetic;
import static org.assertj.core.api.Assertions.assertThat;

class AlphabeticTest {

    @RepeatedTest(10)
    void shouldGenerateAlphabeticOf12Characters() {
        // Act
        String output = randomAlphabetic();
        // Assert
        assertThat(output)
                .isNotNull()
                .hasSize(12)
                .matches("[a-zA-Z]*");
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4, 5, 10, 15, 20, 25, 50})
    void shouldGenerateAlphabetic(int length) {
        // Act
        String output = randomAlphabetic(length);
        // Assert
        assertThat(output)
                .isNotNull()
                .hasSize(length)
                .matches("[a-zA-Z]*");
    }

}
