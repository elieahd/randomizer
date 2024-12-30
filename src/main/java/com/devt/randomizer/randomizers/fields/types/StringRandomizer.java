package com.devt.randomizer.randomizers.fields.types;

import com.devt.randomizer.randomizers.Randomizer;

import java.util.Random;

public class StringRandomizer implements Randomizer<String> {

    private final Random random;
    private final int length;
    private final String characters;

    public StringRandomizer(Random random, int length, String characters) {
        if (length <= 0) {
            throw new IllegalArgumentException(
                    "String randomizer failed initializing, because length '%s' must be greater than 0"
                            .formatted(length)
            );
        }
        if (characters == null || characters.isEmpty()) {
            throw new IllegalArgumentException("String randomizer failed initializing, because characters must not be empty");
        }
        this.random = random;
        this.length = length;
        this.characters = characters;
    }

    @Override
    public String next() {
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            sb.append(characters.charAt(random.nextInt(characters.length())));
        }
        return sb.toString();
    }

}
