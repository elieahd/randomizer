package com.devt.randomizer;

import org.junit.jupiter.api.RepeatedTest;

import static com.devt.randomizer.RandomizerUtils.random;
import static org.assertj.core.api.Assertions.assertThat;

class RandomCharacterTest {

    @RepeatedTest(10)
    void shouldGenerateRandomValue() {
        // Act
        Character output = random(Character.class);
        // Assert
        assertThat(output)
                .isNotNull()
                .matches(Character::isLetter);
    }

    @RepeatedTest(10)
    void shouldGenerateRandomValueOfPrimitive() {
        // Act
        char output = random(char.class);
        // Assert
        assertThat(output).matches(Character::isLetter);
    }

}
