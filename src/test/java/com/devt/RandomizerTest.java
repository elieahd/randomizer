package com.devt;

import org.junit.jupiter.api.RepeatedTest;

class RandomizerTest {

    @RepeatedTest(10)
    void randomizer() {
        System.out.println("Alphanumeric: " + Randomizer.randomAlphanumeric());
        System.out.println("Alphanumeric(10): " + Randomizer.randomAlphanumeric(10));
        System.out.println("Alphabetic: " + Randomizer.randomAlphabetic());
        System.out.println("Alphabetic(10): " + Randomizer.randomAlphabetic(10));
        System.out.println("Alphanumeric with special characters: " + Randomizer.randomAlphanumericWithSpecialCharacters());
        System.out.println("Alphanumeric with special characters(10): " + Randomizer.randomAlphanumericWithSpecialCharacters(10));
        System.out.println("Boolean: " + Randomizer.randomBoolean());

        System.out.println("Double: " + Randomizer.randomDouble());
        System.out.println("Double(50,60): " + Randomizer.randomDouble(50.0, 60.0));

        System.out.println("Integer: " + Randomizer.randomInteger());
        System.out.println("Integer(50,60): " + Randomizer.randomInteger(50, 60));

        System.out.println("Enum: " + Randomizer.randomEnum(Color.class));

        System.out.println("List/Supplier: " + Randomizer.randomListOf(i -> Randomizer.randomAlphabetic()));
        System.out.println("List/Supplier(3): " + Randomizer.randomListOf(i -> Randomizer.randomAlphabetic(), 3));
        System.out.println("List/Supplier/Enum: " + Randomizer.randomListOf(i -> Randomizer.randomEnum(Color.class)));
        System.out.println("List/Supplier/Enum(3): " + Randomizer.randomListOf(i -> Randomizer.randomEnum(Color.class), 3));
        System.out.println();
    }

}

enum Color {
    RED, BLUE, GREEN
}
