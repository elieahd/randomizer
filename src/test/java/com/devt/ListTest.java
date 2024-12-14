package com.devt;

import org.junit.jupiter.api.Test;

import java.util.List;

import static com.devt.Randomizer.randomListOf;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

class ListTest {

    @Test
    void shouldReturnEmptyListWhenNumberOfElementsIs0() {
        // Arrange
        int numberOfElements = 0;
        // Act
        List<String> output = randomListOf(_ -> "toto", numberOfElements);
        // Assert
        assertThat(output)
                .isNotNull()
                .isEmpty();
    }

    @Test
    void shouldReturnListOfELements() {
        // Arrange
        int numberOfElements = 10;
        // Act
        List<String> output = randomListOf(_ -> "toto", numberOfElements);
        // Assert
        assertThat(output)
                .isNotNull()
                .isNotEmpty()
                .hasSize(numberOfElements)
                .containsOnly("toto");
    }

    @Test
    void shouldReturnListOf5ELements() {
        // Act
        List<String> output = randomListOf(_ -> "toto");
        // Assert
        assertThat(output)
                .isNotNull()
                .isNotEmpty()
                .hasSize(5)
                .containsOnly("toto");
    }

    @Test
    void shouldThrowIllegalArgumentExceptionWhenNumberOfElementsIsNegative() {
        // Arrange
        int numberOfElements = -1;
        // Act
        Throwable thrown = catchThrowable(() -> randomListOf(_ -> "toto", numberOfElements));
        // Assert
        assertThat(thrown)
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Randomizing list of elements failed, because number of elements '-1' is less than 0");
    }
}
