package com.devt.randomizer.randomizers.fields.dates;

import java.time.LocalDateTime;
import java.time.OffsetTime;
import java.util.Random;

public class OffsetTimeRandomizer extends AbstractDateRandomizer<OffsetTime> {

    public OffsetTimeRandomizer(Random random, LocalDateTime from, LocalDateTime to) {
        super(random, from, to);
    }

    @Override
    public OffsetTime next() {
        return nextZonedDateTime().toOffsetDateTime().toOffsetTime();
    }

}
