package com.github.javafaker;

import java.util.Locale;

public class Computer {
    private final Faker faker;

    protected Computer(Faker faker) {
        this.faker = faker;
    }

    public String type() {
        return faker.resolve("computer.type");
    }

    public String platform() {
        return faker.resolve("computer.platform");
    }

    public String os() {
        return os(platform().toLowerCase(Locale.ROOT));
    }

    public String os(String make) {
        return faker.resolve("computer.os." + make);
    }
}
