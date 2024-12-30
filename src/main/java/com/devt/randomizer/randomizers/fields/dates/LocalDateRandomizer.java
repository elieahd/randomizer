package com.devt.randomizer.randomizers.fields.dates;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class LocalDateRandomizer extends AbstractDateRandomizer<LocalDate> {

    public LocalDateRandomizer(LocalDateTime from, LocalDateTime to) {
        super(from, to);
    }

    @Override
    public LocalDate next() {
        return nextZonedDateTime().toLocalDate();
    }

}
