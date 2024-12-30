package com.devt.randomizer.randomizers.fields.types;

import com.devt.randomizer.randomizers.Randomizer;

import java.util.Random;

public class CharacterRandomizer implements Randomizer<Character> {

    private final Random random;

    public CharacterRandomizer(Random random) {
        this.random = random;
    }

    @Override
    public Character next() {
        int index = random.nextInt(52);
        if (index < 26) {
            return (char) ('a' + index);
        } else {
            return (char) ('A' + (index - 26));
        }
    }

}
