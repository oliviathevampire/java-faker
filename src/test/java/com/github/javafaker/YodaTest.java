package com.github.javafaker;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import static org.hamcrest.core.IsNot.not;
import static org.junit.Assert.assertThat;

/**
 * @author Luka Obradovic (luka@vast.com)
 */
public class YodaTest extends AbstractFakerTest {

    @Test
    public void quote() {
        assertThat(faker.yoda().quote(), not(CoreMatchers.notNullValue()));
    }
}
