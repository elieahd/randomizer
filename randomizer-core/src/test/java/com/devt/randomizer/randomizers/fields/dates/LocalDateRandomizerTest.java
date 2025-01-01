package com.devt.randomizer.randomizers.fields.dates;

import com.devt.randomizer.randomizers.Randomizer;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static com.devt.TestData.END_OF_THIS_YEAR;
import static com.devt.TestData.FIRST_JAN_LAST_YEAR;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

class LocalDateRandomizerTest {

    @RepeatedTest(10)
    void shouldGenerateARandomValueBetweenRange() {
        // Arrange
        LocalDateTime fromDate = FIRST_JAN_LAST_YEAR;
        LocalDateTime toDate = END_OF_THIS_YEAR;
        // Act
        Randomizer<LocalDate> randomizer = new LocalDateRandomizer(fromDate, toDate);
        LocalDate output = randomizer.next();
        // Assert
        assertThat(output)
                .isNotNull()
                .isBetween(fromDate.toLocalDate(), toDate.toLocalDate());
    }

    @Test
    void shouldThrowIllegalArgumentExceptionWhenFromIsAfterToDate() {
        // Arrange
        LocalDateTime fromDate = END_OF_THIS_YEAR;
        LocalDateTime toDate = FIRST_JAN_LAST_YEAR;
        // Act
        Throwable thrown = catchThrowable(() -> {
            Randomizer<LocalDate> randomizer = new LocalDateRandomizer(fromDate, toDate);
            randomizer.next();
        });
        // Assert
        assertThat(thrown)
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Date randomizer failed initializing, because from date '%s' should be prior to to date '%s'".formatted(fromDate, toDate));
    }

}

