package com.devt.randomizer.randomizers.fields.types;

import com.devt.randomizer.randomizers.Randomizer;

import java.util.UUID;

public class UUIDRandomizer implements Randomizer<UUID> {

    @Override
    public UUID next() {
        return UUID.randomUUID();
    }

}
