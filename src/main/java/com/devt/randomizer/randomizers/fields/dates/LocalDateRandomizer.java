package com.devt.randomizer.randomizers.fields.dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Random;

public class LocalDateRandomizer extends AbstractDateRandomizer<LocalDate> {

    public LocalDateRandomizer(Random random, LocalDateTime from, LocalDateTime to) {
        super(random, from, to);
    }

    @Override
    public LocalDate next() {
        return nextZonedDateTime().toLocalDate();
    }

}
