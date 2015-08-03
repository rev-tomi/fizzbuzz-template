package com.trev.fizzbuzz.template;

import static org.testng.Assert.assertEquals;

import java.util.Iterator;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestFizzBuzzNumbers
{

    private Iterator<Integer> nums;

    @BeforeMethod
    public void setUp()
    {
        final FizzBuzzTemplate sut = new FizzBuzzTemplate();
        nums = sut.getFizzBuzzNumbers().iterator();
    }

    @Test
    public void testFizzBuzzNumbersStart()
    {
        // THEN
        assertEquals(nums.next(), new Integer(1));
    }

    @Test
    public void testFizzBuzzNumbers()
    {
        // THEN
        Integer i = 0; // start value, inclusive
        while (nums.hasNext())
        {
            i = i + 1; // step size
            assertEquals(i, nums.next());
        }
        assertEquals(new Integer(100), i, "End Value, inclusive"); // end value, inclusive
    }
}
