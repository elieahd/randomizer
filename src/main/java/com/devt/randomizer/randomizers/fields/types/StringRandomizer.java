package com.devt.randomizer.randomizers.fields.types;

import com.devt.randomizer.randomizers.Randomizer;

import java.util.concurrent.ThreadLocalRandom;

public class StringRandomizer implements Randomizer<String> {

    private final int length;
    private final String characters;

    public StringRandomizer(int length, String characters) {
        if (length <= 0) {
            throw new IllegalArgumentException(
                    "String randomizer failed initializing, because length '%s' must be greater than 0"
                            .formatted(length)
            );
        }
        if (characters == null || characters.isEmpty()) {
            throw new IllegalArgumentException("String randomizer failed initializing, because characters must not be empty");
        }
        this.length = length;
        this.characters = characters;
    }

    @Override
    public String next() {
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            sb.append(characters.charAt(ThreadLocalRandom.current().nextInt(characters.length())));
        }
        return sb.toString();
    }

}
