package com.github.javafaker;

import org.junit.Test;

import static com.github.javafaker.matchers.MatchesRegularExpression.matchesRegularExpression;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;

public class MinecraftTest extends AbstractFakerTest {

    @Test
    public void achievements() {
        assertThat(faker.minecraft().achievement(), matchesRegularExpression("[\\w ?!\\.,']+"));
    }

    @Test
    public void biome() {
        assertThat(faker.minecraft().biome(), matchesRegularExpression("^(.+'?:?\\s?)+$"));
    }

    @Test
    public void blocks() {
        assertThat(faker.minecraft().block(), matchesRegularExpression("^(.+'?:?\\s?)+$"));
    }

    @Test
    public void items() {
        assertThat(faker.minecraft().item(), matchesRegularExpression("^(.+'?:?\\s?)+$"));
    }

    @Test
    public void enchantments() {
        assertThat(faker.minecraft().enchantment(), matchesRegularExpression("^(.+'?:?\\s?)+$"));
    }

    @Test
    public void gameModes() {
        assertThat(faker.minecraft().gameMode(), matchesRegularExpression("^(.+'?:?\\s?)+$"));
    }

    @Test
    public void mobs() {
        assertThat(faker.minecraft().mob(), matchesRegularExpression("^(.+'?:?\\s?)+$"));
    }

    @Test
    public void statusEffects() {
        assertThat(faker.minecraft().statusEffect(), matchesRegularExpression("^(.+'?:?\\s?)+$"));
    }

}
