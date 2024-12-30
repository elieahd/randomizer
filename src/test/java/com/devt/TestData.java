package com.devt;

import java.time.LocalDateTime;
import java.time.Year;

public class TestData {

    public static final LocalDateTime FIRST_JAN_LAST_YEAR = LocalDateTime.of(Year.now().getValue() - 1, 1, 1, 0, 0);
    public static final LocalDateTime END_OF_THIS_YEAR = LocalDateTime.of(Year.now().getValue(), 12, 31, 23, 59, 59);

    private TestData() {
        // utility class shouldn't be initialized
    }

}
