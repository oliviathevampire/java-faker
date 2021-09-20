package com.github.javafaker;

import org.junit.Test;

import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Random;

import static com.github.javafaker.matchers.IsANumber.isANumber;
import static com.github.javafaker.matchers.IsStringWithContents.isStringWithContents;
import static com.github.javafaker.matchers.MatchesRegularExpression.matchesRegularExpression;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

public class AdjectiveTest extends AbstractFakerTest {

    private static final char decimalSeparator = new DecimalFormatSymbols().getDecimalSeparator();

    @Test
    public void testPositive() {
        assertThat(faker.adjective().positive(), matchesRegularExpression("\\w+"));
    }

    @Test
    public void testNegative() {
        assertThat(faker.adjective().negative(), matchesRegularExpression("\\w+"));
    }

}
