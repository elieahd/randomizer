package com.devt;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static com.devt.Randomizer.randomAlphanumeric;
import static org.assertj.core.api.Assertions.assertThat;

class AlphanumericTest {

    @RepeatedTest(10)
    void shouldGenerateAlphanumericOf12Characters() {
        // Act
        String output = randomAlphanumeric();
        // Assert
        assertThat(output)
                .isNotNull()
                .hasSize(12)
                .matches("[a-zA-Z0-9]*");
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4, 5, 10, 15, 20, 25, 50})
    void shouldGenerateAlphanumeric(int length) {
        // Act
        String output = randomAlphanumeric(length);
        // Assert
        assertThat(output)
                .isNotNull()
                .hasSize(length)
                .matches("[a-zA-Z0-9]*");
    }
}
