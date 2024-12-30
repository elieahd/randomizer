package com.devt.randomizer.randomizers.fields.dates;

import java.sql.Date;
import java.time.LocalDateTime;
import java.util.Random;

public class SqlDateRandomizer extends AbstractDateRandomizer<Date> {

    public SqlDateRandomizer(Random random, LocalDateTime from, LocalDateTime to) {
        super(random, from, to);
    }

    @Override
    public Date next() {
        return new Date(nextZonedDateTime().toInstant().toEpochMilli());
    }

}
