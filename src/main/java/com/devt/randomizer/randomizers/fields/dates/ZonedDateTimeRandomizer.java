package com.devt.randomizer.randomizers.fields.dates;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;

public class ZonedDateTimeRandomizer extends AbstractDateRandomizer<ZonedDateTime> {

    public ZonedDateTimeRandomizer(LocalDateTime from, LocalDateTime to) {
        super(from, to);
    }

    @Override
    public ZonedDateTime next() {
        return nextZonedDateTime();
    }

}
