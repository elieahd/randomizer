package com.devt.randomizer.randomizers.fields.dates;

import com.devt.randomizer.randomizers.Randomizer;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Random;

public abstract class AbstractDateRandomizer<T> implements Randomizer<T> {

    private static final ZoneOffset UTC = ZoneOffset.UTC;

    protected final Random random;
    protected final Instant fromInstant;
    protected final Instant toInstant;

    protected AbstractDateRandomizer(Random random,
                                     LocalDateTime fromDate,
                                     LocalDateTime toDate) {
        if (toDate.isBefore(fromDate)) {
            throw new IllegalArgumentException(
                    "Date randomizer failed initializing, because from date '%s' should be prior to to date '%s'"
                            .formatted(fromDate, toDate)
            );
        }
        this.random = random;
        this.fromInstant = fromDate.atZone(UTC).toInstant();
        this.toInstant = toDate.atZone(UTC).toInstant();
    }

    protected ZonedDateTime nextZonedDateTime() {
        return randomInstant().atZone(UTC);
    }

    private Instant randomInstant() {
        long startMillis = fromInstant.toEpochMilli();
        long endMillis = toInstant.toEpochMilli();
        long randomMillis = startMillis + (long) (random.nextDouble() * (endMillis - startMillis));
        return Instant.ofEpochMilli(randomMillis);
    }

}
