package com.devt.randomizer.randomizers.fields.dates;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.Random;

public class ZonedDateTimeRandomizer extends AbstractDateRandomizer<ZonedDateTime> {

    public ZonedDateTimeRandomizer(Random random, LocalDateTime from, LocalDateTime to) {
        super(random, from, to);
    }

    @Override
    public ZonedDateTime next() {
        return nextZonedDateTime();
    }

}
