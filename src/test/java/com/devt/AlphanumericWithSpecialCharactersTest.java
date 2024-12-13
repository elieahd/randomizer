package com.devt;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static com.devt.Randomizer.random;
import static com.devt.Randomizer.randomAlphanumericWithSpecialCharacters;
import static org.assertj.core.api.Assertions.assertThat;

class AlphanumericWithSpecialCharactersTest {

    @RepeatedTest(10)
    void shouldGenerateAlphanumericWithSpecialCharactersOf12Characters() {
        // Act
        String output = randomAlphanumericWithSpecialCharacters();
        // Assert
        assertThat(output)
                .isNotNull()
                .hasSize(12)
                .matches("[a-zA-Z0-9!@#$%^&*()\\-_=+\\[\\]{}|;:'\",./<>?]*");
    }

    @RepeatedTest(10)
    void shouldGenerateRandomString() {
        // Act
        String output = random(String.class);
        // Assert
        assertThat(output)
                .isNotNull()
                .hasSize(12)
                .matches("[a-zA-Z0-9!@#$%^&*()\\-_=+\\[\\]{}|;:'\",./<>?]*");
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4, 5, 10, 15, 20, 25, 50})
    void shouldGenerateAlphanumericWithSpecialCharacters(int length) {
        // Act
        String output = randomAlphanumericWithSpecialCharacters(length);
        // Assert
        assertThat(output)
                .isNotNull()
                .hasSize(length)
                .matches("[a-zA-Z0-9!@#$%^&*()\\-_=+\\[\\]{}|;:'\",./<>?]*");
    }

}
