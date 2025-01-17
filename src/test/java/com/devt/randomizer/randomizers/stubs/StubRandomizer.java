package com.devt.randomizer.randomizers.stubs;

import com.devt.randomizer.randomizers.Randomizer;

public class StubRandomizer implements Randomizer<String> {

    private final String prefix;
    private int counter;

    public StubRandomizer(String prefix) {
        this.prefix = prefix;
    }

    public StubRandomizer() {
        this("element");
    }

    @Override
    public String next() {
        counter++;
        return prefix + counter;
    }

}
