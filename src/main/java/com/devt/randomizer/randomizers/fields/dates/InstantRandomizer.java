package com.devt.randomizer.randomizers.fields.dates;

import java.time.Instant;
import java.time.LocalDateTime;

public class InstantRandomizer extends AbstractDateRandomizer<Instant> {

    public InstantRandomizer(LocalDateTime from, LocalDateTime to) {
        super(from, to);
    }

    @Override
    public Instant next() {
        return nextZonedDateTime().toInstant();
    }

}
