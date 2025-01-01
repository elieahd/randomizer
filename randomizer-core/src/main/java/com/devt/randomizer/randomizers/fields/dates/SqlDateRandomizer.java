package com.devt.randomizer.randomizers.fields.dates;

import java.sql.Date;
import java.time.LocalDateTime;

public class SqlDateRandomizer extends AbstractDateRandomizer<Date> {

    public SqlDateRandomizer(LocalDateTime from, LocalDateTime to) {
        super(from, to);
    }

    @Override
    public Date next() {
        return new Date(nextZonedDateTime().toInstant().toEpochMilli());
    }

}
