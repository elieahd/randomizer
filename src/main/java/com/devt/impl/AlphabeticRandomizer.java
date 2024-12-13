package com.devt.impl;

import java.util.Random;

public class AlphabeticRandomizer extends StringRandomizer {

    private static final String ALPHABETIC_CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
            + "abcdefghijklmnopqrstuvwxyz";

    public AlphabeticRandomizer(Random random) {
        super(ALPHABETIC_CHARACTERS, random);
    }

}
