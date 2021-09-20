package com.github.javafaker;

public class Adjective {
    private final Faker faker;

    protected Adjective(Faker faker) {
        this.faker = faker;
    }

    public String positive() {
        return faker.resolve("adjective.positive");
    }

    public String negative() {
        return faker.resolve("adjective.negative");
    }
}
