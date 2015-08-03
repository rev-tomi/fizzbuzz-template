package com.trev.fizzbuzz.template;

import static org.testng.Assert.assertEquals;

import java.util.Iterator;

import org.testng.annotations.Test;

public class TestFizzBuzzNumbers
{

    @Test
    public void testFizzBuzzNumbers()
    {
        // GIVEN
        final FizzBuzzTemplate sut = new FizzBuzzTemplate();

        // WHEN
        final Iterable<Integer> nums = sut.getFizzBuzzNumbers();
        final Iterator<Integer> iterator = nums.iterator();

        // THEN
        Integer i = 0; // start value, inclusive
        while (iterator.hasNext())
        {
            i = i + 1; // step size
            assertEquals(i, iterator.next());
        }
        assertEquals(new Integer(100), i, "End Value, inclusive"); // end value, inclusive
    }
}
