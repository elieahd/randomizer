package com.devt.randomizer.randomizers.fields.types;

import com.devt.randomizer.randomizers.Randomizer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;

import static org.assertj.core.api.Assertions.assertThat;

class BooleanRandomizerTest {

    private Randomizer<Boolean> randomizer;

    @BeforeEach
    void setUp() {
        randomizer = new BooleanRandomizer();
    }

    @RepeatedTest(10)
    void shouldGenerateRandomBoolean() {
        // Act
        Boolean output = randomizer.next();
        // Assert
        assertThat(output).isIn(true, false);
    }

}
