package com.devt.randomizer.randomizers.collections;

import com.devt.randomizer.randomizers.Randomizer;
import com.devt.randomizer.randomizers.StubRandomizer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

class MapRandomizerTest {

    private Randomizer<String> keyRandomizer;
    private Randomizer<String> valueRandomizer;

    @BeforeEach
    void setUp() {
        keyRandomizer = new StubRandomizer("key");
        valueRandomizer = new StubRandomizer("value");
    }

    @Test
    void shouldGenerateCollectionOfElements() {
        // Arrange
        int numberOfElements = 3;
        // Act
        MapRandomizer<String, String> randomizer = new MapRandomizer<>(keyRandomizer, valueRandomizer, numberOfElements);
        Map<String, String> output = randomizer.next();
        // Assert
        assertThat(output)
                .isNotNull()
                .hasSize(numberOfElements)
                .containsEntry("key1", "value1")
                .containsEntry("key2", "value2")
                .containsEntry("key3", "value3");
    }

    @Test
    void shouldGenerateExactlyOneElement() {
        // Arrange
        int numberOfElements = 1;
        // Act
        MapRandomizer<String, String> randomizer = new MapRandomizer<>(keyRandomizer, valueRandomizer, numberOfElements);
        Map<String, String> output = randomizer.next();
        // Assert
        assertThat(output)
                .isNotNull()
                .hasSize(1)
                .containsEntry("key1", "value1");
    }

    @Test
    void shouldThrowIllegalArgumentExceptionWhenNumberOfElementsIsZero() {
        // Arrange
        int numberOfElements = 0;
        // Act
        Throwable thrown = catchThrowable(() -> {
            MapRandomizer<String, String> randomizer = new MapRandomizer<>(keyRandomizer, valueRandomizer, numberOfElements);
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
            MapRandomizer<String, String> randomizer = new MapRandomizer<>(keyRandomizer, valueRandomizer, numberOfElements);
            randomizer.next();
        });
        // Assert
        assertThat(thrown)
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Collection randomizer failed initializing, because number of elements '-1' must be greater than 0");
    }

}
