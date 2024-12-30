package com.devt.randomizer.randomizers.fields.numbers;

import com.devt.randomizer.randomizers.Randomizer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;
import java.util.Random;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

class BigIntegerRandomizerTest {

    private Random random;

    @BeforeEach
    void setUp() {
        random = new Random();
    }

    @RepeatedTest(10)
    void shouldGenerateARandomValueBetweenMinAndMax() {
        // Arrange
        BigInteger min = BigInteger.TEN;
        BigInteger max = BigInteger.valueOf(100L);
        // Act
        Randomizer<BigInteger> randomizer = new BigIntegerRandomizer(random, min, max);
        BigInteger output = randomizer.next();
        // Assert
        assertThat(output)
                .isNotNull()
                .isBetween(min, max);
    }

    @Test
    void shouldGenerateExactlyANumberWhenMinIsToEqualToMax() {
        // Arrange
        BigInteger min = BigInteger.TEN;
        BigInteger max = BigInteger.TEN;
        // Act
        Randomizer<BigInteger> randomizer = new BigIntegerRandomizer(random, min, max);
        BigInteger output = randomizer.next();
        // Act
        // Assert
        assertThat(output)
                .isNotNull()
                .isEqualTo(BigInteger.TEN);
    }

    @Test
    void shouldThrowIllegalArgumentExceptionWhenMinIsMoreThanMax() {
        // Arrange
        BigInteger min = BigInteger.TEN;
        BigInteger max = BigInteger.TWO;
        // Act
        Throwable thrown = catchThrowable(() -> {
            Randomizer<BigInteger> randomizer = new BigIntegerRandomizer(random, min, max);
            randomizer.next();
        });
        // Assert
        assertThat(thrown)
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("BigInteger randomizer failed initializing, because min '10' should be less than or equal to max '2'");
    }

}
