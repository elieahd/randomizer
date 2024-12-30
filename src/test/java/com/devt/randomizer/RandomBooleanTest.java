package com.devt.randomizer;

import org.junit.jupiter.api.RepeatedTest;

import static com.devt.randomizer.RandomizerUtils.random;
import static org.assertj.core.api.Assertions.assertThat;

class RandomBooleanTest {

    @RepeatedTest(10)
    void shouldGenerateRandomValue() {
        // Act
        Boolean output = random(Boolean.class);
        // Assert
        assertThat(output)
                .isNotNull()
                .isIn(true, false);
    }

    @RepeatedTest(10)
    void shouldGenerateRandomValueOfPrimitive() {
        // Act
        boolean output = random(boolean.class);
        // Assert
        assertThat(output).isIn(true, false);
    }

}
