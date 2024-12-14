package com.devt;

import org.junit.jupiter.api.RepeatedTest;

import static com.devt.Randomizer.random;
import static com.devt.Randomizer.randomBoolean;
import static org.assertj.core.api.Assertions.assertThat;

class BooleanTest {

    @RepeatedTest(10)
    void shouldGenerateRandomOfBoolean() {
        // Act
        Boolean output = random(Boolean.class);
        // Assert
        assertThat(output)
                .isNotNull()
                .isIn(true, false);
    }

    @RepeatedTest(10)
    void shouldGenerateRandomOfPrimitiveBoolean() {
        // Act
        boolean output = random(boolean.class);
        // Assert
        assertThat(output).isIn(true, false);
    }

    @RepeatedTest(10)
    void shouldGenerateBooleans() {
        // Act
        boolean output = randomBoolean();
        // Assert
        assertThat(output).isIn(true, false);
    }

}
