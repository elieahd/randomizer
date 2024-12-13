package com.devt.impl;

import java.util.Random;

public class AlphanumericSpecialCharacterRandomizer extends StringRandomizer {

    private static final String ALPHANUMERIC_WITH_SPECIAL_CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
            + "abcdefghijklmnopqrstuvwxyz"
            + "0123456789"
            + "!@#$%^&*()-_=+[]{}|;:'\",./<>?";

    public AlphanumericSpecialCharacterRandomizer(Random random) {
        super(ALPHANUMERIC_WITH_SPECIAL_CHARACTERS, random);
    }

}
