package com.devt;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static com.devt.EnumTest.Color.BLUE;
import static com.devt.EnumTest.Color.GREEN;
import static com.devt.EnumTest.Color.RED;
import static com.devt.Randomizer.randomEnum;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

class EnumTest {

    enum Color {
        RED, BLUE, GREEN
    }

    @RepeatedTest(20)
    void shouldGenerateRandomEnum() {
        // Act
        Color output = randomEnum(Color.class);
        // Assert
        assertThat(output)
                .isNotNull()
                .isIn(RED, BLUE, GREEN);
    }

    enum UnoValue {
        ME
    }

    @Test
    void shouldGenerateRandomEnumWith1Value() {
        // Act
        UnoValue output = randomEnum(UnoValue.class);
        // Assert
        assertThat(output)
                .isNotNull()
                .isEqualTo(UnoValue.ME);
    }

    enum NoValue {
    }

    @Test
    void shouldThrowIllegalArgumentExceptionWhenNoValuesInEnum() {
        // Act
        Throwable thrown = catchThrowable(() -> randomEnum(NoValue.class));
        // Assert
        assertThat(thrown)
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Enum 'com.devt.EnumTest.NoValue' has no values");
    }

}
