package com.devt.randomizer.randomizers.fields.dates;

import java.time.LocalDateTime;
import java.time.OffsetTime;

public class OffsetTimeRandomizer extends AbstractDateRandomizer<OffsetTime> {

    public OffsetTimeRandomizer(LocalDateTime from, LocalDateTime to) {
        super(from, to);
    }

    @Override
    public OffsetTime next() {
        return nextZonedDateTime().toOffsetDateTime().toOffsetTime();
    }

}
