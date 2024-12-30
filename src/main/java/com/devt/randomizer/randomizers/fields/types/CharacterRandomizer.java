package com.devt.randomizer.randomizers.fields.types;

import com.devt.randomizer.randomizers.Randomizer;

import java.util.concurrent.ThreadLocalRandom;

public class CharacterRandomizer implements Randomizer<Character> {

    @Override
    public Character next() {
        int index = ThreadLocalRandom.current().nextInt(52);
        if (index < 26) {
            return (char) ('a' + index);
        } else {
            return (char) ('A' + (index - 26));
        }
    }

}
