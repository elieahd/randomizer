package com.devt.impl;

import java.util.Random;

public class AlphanumericRandomizer extends StringRandomizer {

    private static final String ALPHANUMERIC_CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
            + "abcdefghijklmnopqrstuvwxyz"
            + "0123456789";

    public AlphanumericRandomizer(Random random) {
        super(ALPHANUMERIC_CHARACTERS, random);
    }

}
