package com.devt.randomizer.randomizers.fields.types;

import com.devt.randomizer.randomizers.Randomizer;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

class EnumRandomizerTest {

    @RepeatedTest(20)
    void shouldGenerateRandomEnum() {
        // Act
        Randomizer<Color> randomizer = new EnumRandomizer<>(Color.class);
        Color output = randomizer.next();
        // Assert
        assertThat(output)
                .isNotNull()
                .isIn(Color.RED, Color.BLUE, Color.GREEN);
    }

    @Test
    void shouldGenerateRandomEnumWith1Value() {
        // Act
        Randomizer<UnoValue> randomizer = new EnumRandomizer<>(UnoValue.class);
        UnoValue output = randomizer.next();
        // Assert
        assertThat(output)
                .isNotNull()
                .isEqualTo(UnoValue.ME);
    }

    @Test
    void shouldThrowIllegalArgumentExceptionWhenNoValuesInEnum() {
        // Act
        Throwable thrown = catchThrowable(() -> {
            Randomizer<NoValue> randomizer = new EnumRandomizer<>(NoValue.class);
            randomizer.next();
        });
        // Assert
        assertThat(thrown)
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Enum randomizer failed initializing for 'NoValue', because it does not contains any value");
    }

    enum Color {
        RED, BLUE, GREEN
    }


    enum UnoValue {
        ME
    }

    enum NoValue {
    }

}
