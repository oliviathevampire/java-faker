package com.github.javafaker;

import static org.hamcrest.Matchers.isEmptyOrNullString;
import static org.hamcrest.core.IsNot.not;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.lang.reflect.InvocationTargetException;

public class RelationshipTest extends AbstractFakerTest {

    private Faker mockFaker;

    @Before
    public void before() {
        super.before();
        mockFaker = Mockito.mock(Faker.class);
    }

    @Test
    public void anyTest() {
        assertThat(faker.relationships().any(), not(CoreMatchers.notNullValue()));
    }

    @Test
    public void directTest() {
        assertThat(faker.relationships().direct(), not(CoreMatchers.notNullValue()));
    }

    @Test
    public void extendedTest() {
        assertThat(faker.relationships().extended(), not(CoreMatchers.notNullValue()));
    }

    @Test
    public void inLawTest() {
        assertThat(faker.relationships().inLaw(), not(CoreMatchers.notNullValue()));
    }

    @Test
    public void spouseTest() {
        assertThat(faker.relationships().spouse(), not(CoreMatchers.notNullValue()));
    }

    @Test
    public void parentTest() {
        assertThat(faker.relationships().parent(), not(CoreMatchers.notNullValue()));
    }

    @Test
    public void siblingTest() {
        assertThat(faker.relationships().sibling(), not(CoreMatchers.notNullValue()));
    }

    @Test(expected = RuntimeException.class)
    public void anyWithIllegalArgumentExceptionThrown() {
        when(mockFaker.random()).thenThrow(new IllegalArgumentException());
        new Relationships(mockFaker).any();
    }

    @Test(expected = RuntimeException.class)
    public void anyWithSecurityExceptionThrown() {
        when(mockFaker.random()).thenThrow(new SecurityException());
        new Relationships(mockFaker).any();
    }

    @Test(expected = RuntimeException.class)
    public void anyWithIllegalAccessExceptionThrown() {
        when(mockFaker.random()).thenThrow(new IllegalAccessException());
        new Relationships(mockFaker).any();
    }

    @Test(expected = RuntimeException.class)
    public void anyWithInvocationTargetExceptionThrown() {
        when(mockFaker.random()).thenThrow(new InvocationTargetException(new Exception()));
        new Relationships(mockFaker).any();
    }

}
