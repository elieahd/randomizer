package com.devt.randomizer.randomizers.collections;

import com.devt.randomizer.randomizers.Randomizer;
import com.devt.randomizer.randomizers.StubRandomizer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

class StreamRandomizerTest {

    private Randomizer<String> elementRandomizer;

    @BeforeEach
    void setUp() {
        elementRandomizer = new StubRandomizer("element");
    }

    @Test
    void shouldGenerateCollectionOfElements() {
        // Arrange
        int numberOfElements = 3;
        // Act
        StreamRandomizer<String> randomizer = new StreamRandomizer<>(elementRandomizer, numberOfElements);
        Stream<String> output = randomizer.next();
        // Assert
        assertThat(output)
                .isNotNull()
                .hasSize(numberOfElements)
                .containsExactly("element1", "element2", "element3");
    }

    @Test
    void shouldGenerateExactlyOneElement() {
        // Arrange
        int numberOfElements = 1;
        // Act
        StreamRandomizer<String> randomizer = new StreamRandomizer<>(elementRandomizer, numberOfElements);
        Stream<String> output = randomizer.next();
        // Assert
        assertThat(output)
                .isNotNull()
                .hasSize(1)
                .contains("element1");
    }

    @Test
    void shouldThrowIllegalArgumentExceptionWhenNumberOfElementsIsZero() {
        // Arrange
        int numberOfElements = 0;
        // Act
        Throwable thrown = catchThrowable(() -> {
            StreamRandomizer<String> randomizer = new StreamRandomizer<>(elementRandomizer, numberOfElements);
            randomizer.next();
        });
        // Assert
        assertThat(thrown)
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Collection randomizer failed initializing, because number of elements '0' must be greater than 0");
    }

    @Test
    void shouldThrowIllegalArgumentExceptionWhenNumberOfElementsIsNegative() {
        // Arrange
        int numberOfElements = -1;
        // Act
        Throwable thrown = catchThrowable(() -> {
            StreamRandomizer<String> randomizer = new StreamRandomizer<>(elementRandomizer, numberOfElements);
            randomizer.next();
        });
        // Assert
        assertThat(thrown)
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Collection randomizer failed initializing, because number of elements '-1' must be greater than 0");
    }

}
