package com.devt.randomizer.randomizers.fields.dates;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;

public class OffsetDateTimeRandomizer extends AbstractDateRandomizer<OffsetDateTime> {

    public OffsetDateTimeRandomizer(LocalDateTime from, LocalDateTime to) {
        super(from, to);
    }

    @Override
    public OffsetDateTime next() {
        return nextZonedDateTime().toOffsetDateTime();
    }

}
