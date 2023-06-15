package com.philimonov.iterator;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

import java.util.NoSuchElementException;

public class ArrayItTest {

    @Test
    public void whenMultiCallhasNextThenTrue() {
        ArrayIt iterator = new ArrayIt(
                new int[] {1, 2, 3}
        );
        assertThat(iterator.hasNext(), is(true));
        assertThat(iterator.hasNext(), is(true));
    }

    @Test
    public void whenReadSequence() {
        ArrayIt iterator = new ArrayIt(
                new int[] {1, 2, 3}
        );
        assertThat(iterator.next(), is(1));
        assertThat(iterator.next(), is(2));
        assertThat(iterator.next(), is(3));
    }

    @Test(expected = NoSuchElementException.class)
    public void whenNextFromEmpty() {
        ArrayIt iterator = new ArrayIt(
                new int[] {}
        );
        iterator.next();
    }
}