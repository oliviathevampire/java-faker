package com.github.javafaker;

public class Minecraft {
    private final Faker faker;

    protected Minecraft(Faker faker) {
        this.faker = faker;
    }

    public String achievement() {
        return faker.fakeValuesService().resolve("games.minecraft.achievement", this, faker);
    }

    public String biome() {
        return faker.fakeValuesService().resolve("games.minecraft.biome", this, faker);
    }

    public String block() {
        return faker.fakeValuesService().resolve("games.minecraft.blocks", this, faker);
    }

    public String enchantment() {
        return faker.fakeValuesService().resolve("games.minecraft.enchantment", this, faker);
    }

    public String gameMode() {
        return faker.fakeValuesService().resolve("games.minecraft.game_mode", this, faker);
    }

    public String item() {
        return faker.fakeValuesService().resolve("games.minecraft.items", this, faker);
    }

    public String mob() {
        return faker.fakeValuesService().resolve("games.minecraft.mobs", this, faker);
    }

    public String statusEffect() {
        return faker.fakeValuesService().resolve("games.minecraft.status_effect", this, faker);
    }
}
