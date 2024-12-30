package com.devt.randomizer.randomizers.fields.dates;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Random;

public class DateRandomizer extends AbstractDateRandomizer<Date> {

    public DateRandomizer(Random random, LocalDateTime from, LocalDateTime to) {
        super(random, from, to);
    }

    @Override
    public Date next() {
        return new Date(nextZonedDateTime().toInstant().toEpochMilli());
    }

}
