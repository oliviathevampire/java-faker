package com.github.javafaker;

import org.junit.Test;

import java.util.Locale;

import static com.github.javafaker.matchers.MatchesRegularExpression.matchesRegularExpression;
import static org.junit.Assert.assertThat;

public class ComputerTest extends AbstractFakerTest {

    @Test
    public void testType() {
        assertThat(faker.computer().type(), matchesRegularExpression("[A-Za-z\\-&', ]+"));
    }

    @Test
    public void testPlatform() {
        assertThat(faker.computer().platform(), matchesRegularExpression("[A-Za-z ]+"));
    }

    @Test
    public void testOs() {
        assertThat(faker.computer().os(), matchesRegularExpression("[A-Za-z 0-9\\.\\(\\)]+"));
    }

    @Test
    public void testOs2() {
        assertThat(faker.computer().os(faker.computer().platform().toLowerCase(Locale.ROOT)), matchesRegularExpression("[A-Za-z 0-9\\.\\(\\)]+"));
    }
}
