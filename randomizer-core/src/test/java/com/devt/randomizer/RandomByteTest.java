package com.devt.randomizer;

import org.junit.jupiter.api.RepeatedTest;

import static com.devt.randomizer.RandomizerParameterTest.DEFAULT_MAX_BYE;
import static com.devt.randomizer.RandomizerParameterTest.DEFAULT_MIN_BYTE;
import static com.devt.randomizer.RandomizerUtils.random;
import static org.assertj.core.api.Assertions.assertThat;

class RandomByteTest {

    @RepeatedTest(10)
    void shouldGenerateRandomValue() {
        // Act
        Byte output = random(Byte.class);
        // Assert
        assertThat(output)
                .isNotNull()
                .isBetween(DEFAULT_MIN_BYTE, DEFAULT_MAX_BYE);
    }

    @RepeatedTest(10)
    void shouldGenerateRandomValueOfPrimitive() {
        // Act
        byte output = random(byte.class);
        // Assert
        assertThat(output).isBetween(DEFAULT_MIN_BYTE, DEFAULT_MAX_BYE);
    }

}
