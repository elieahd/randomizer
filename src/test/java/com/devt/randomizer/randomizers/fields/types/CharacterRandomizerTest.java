package com.devt.randomizer.randomizers.fields.types;

import com.devt.randomizer.randomizers.Randomizer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;

import java.util.Random;

import static org.assertj.core.api.Assertions.assertThat;

class CharacterRandomizerTest {

    private Randomizer<Character> randomizer;

    @BeforeEach
    void setUp() {
        Random random = new Random();
        randomizer = new CharacterRandomizer(random);
    }

    @RepeatedTest(10)
    void shouldGenerateARandomValue() {
        // Act
        Character output = randomizer.next();
        // Assert
        assertThat(output)
                .isNotNull()
                .matches(Character::isLetter);
    }

}
