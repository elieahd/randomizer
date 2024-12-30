package com.devt.randomizer.randomizers.fields.dates;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Random;

public class LocalTimeRandomizer extends AbstractDateRandomizer<LocalTime> {

    public LocalTimeRandomizer(Random random, LocalDateTime from, LocalDateTime to) {
        super(random, from, to);
    }

    @Override
    public LocalTime next() {
        return nextZonedDateTime().toLocalTime();
    }

}
