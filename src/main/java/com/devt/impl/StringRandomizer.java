package com.devt.impl;

import java.util.Random;

public class StringRandomizer {

    private final String characters;
    private final Random random;

    public StringRandomizer(String characters, Random random) {
        this.characters = characters;
        this.random = random;
    }

    public String next(int length) {
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            sb.append(characters.charAt(random.nextInt(characters.length())));
        }
        return sb.toString();
    }

}
