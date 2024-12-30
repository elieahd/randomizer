package com.devt.randomizer.randomizers.fields.dates;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.util.Random;

public class OffsetDateTimeRandomizer extends AbstractDateRandomizer<OffsetDateTime> {

    public OffsetDateTimeRandomizer(Random random, LocalDateTime from, LocalDateTime to) {
        super(random, from, to);
    }

    @Override
    public OffsetDateTime next() {
        return nextZonedDateTime().toOffsetDateTime();
    }

}
