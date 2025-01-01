package com.devt.randomizer.randomizers.fields.dates;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalTimeRandomizer extends AbstractDateRandomizer<LocalTime> {

    public LocalTimeRandomizer(LocalDateTime from, LocalDateTime to) {
        super(from, to);
    }

    @Override
    public LocalTime next() {
        return nextZonedDateTime().toLocalTime();
    }

}
