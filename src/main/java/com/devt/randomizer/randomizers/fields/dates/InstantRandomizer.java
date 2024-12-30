package com.devt.randomizer.randomizers.fields.dates;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Random;

public class InstantRandomizer extends AbstractDateRandomizer<Instant> {

    public InstantRandomizer(Random random, LocalDateTime from, LocalDateTime to) {
        super(random, from, to);
    }

    @Override
    public Instant next() {
        return nextZonedDateTime().toInstant();
    }

}
