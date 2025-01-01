package com.devt.randomizer.randomizers.fields.dates;

import java.time.LocalDateTime;

public class LocalDateTimeRandomizer extends AbstractDateRandomizer<LocalDateTime> {

    public LocalDateTimeRandomizer(LocalDateTime from, LocalDateTime to) {
        super(from, to);
    }

    @Override
    public LocalDateTime next() {
        return nextZonedDateTime().toLocalDateTime();
    }

}
