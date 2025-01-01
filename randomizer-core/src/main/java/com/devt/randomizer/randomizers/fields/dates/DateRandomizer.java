package com.devt.randomizer.randomizers.fields.dates;

import java.time.LocalDateTime;
import java.util.Date;

public class DateRandomizer extends AbstractDateRandomizer<Date> {

    public DateRandomizer(LocalDateTime from, LocalDateTime to) {
        super(from, to);
    }

    @Override
    public Date next() {
        return new Date(nextZonedDateTime().toInstant().toEpochMilli());
    }

}
