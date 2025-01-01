package com.devt.randomizer;

import org.junit.jupiter.api.Test;

import java.util.List;

import static com.devt.randomizer.RandomizerUtils.random;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

class RandomUnsupportedOperationTest {

    @Test
    void shouldThrowUnsupportedOperationException() {
        // Act
        Throwable thrown = catchThrowable(() -> random(List.class));
        // Assert
        assertThat(thrown)
                .isInstanceOf(UnsupportedOperationException.class)
                .hasMessage("'java.util.List' is not a supported field");
    }

}
