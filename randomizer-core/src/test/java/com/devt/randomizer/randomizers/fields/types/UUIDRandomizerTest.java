package com.devt.randomizer.randomizers.fields.types;

import com.devt.randomizer.randomizers.Randomizer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;

import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;

class UUIDRandomizerTest {

    private Randomizer<UUID> randomizer;

    @BeforeEach
    void setUp() {
        randomizer = new UUIDRandomizer();
    }

    @RepeatedTest(10)
    void shouldGenerateValue() {
        // Act
        UUID output = randomizer.next();
        // Assert
        assertThat(output.toString())
                .isNotNull()
                .matches("^[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}$");
    }

}
