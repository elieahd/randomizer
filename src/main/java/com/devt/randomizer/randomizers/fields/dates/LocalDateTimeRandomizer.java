package com.devt.randomizer.randomizers.fields.dates;

import java.time.LocalDateTime;
import java.util.Random;

public class LocalDateTimeRandomizer extends AbstractDateRandomizer<LocalDateTime> {

    public LocalDateTimeRandomizer(Random random, LocalDateTime from, LocalDateTime to) {
        super(random, from, to);
    }

    @Override
    public LocalDateTime next() {
        return nextZonedDateTime().toLocalDateTime();
    }

}
