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
    public void testFizzBuzzNumbersEnd()
    {
        // WHEN
        Integer i = null;
        while (nums.hasNext())
        {
            i = nums.next(); // i is last from iterator now
        }

        // THEN
        assertEquals(i, new Integer(100));
    }

    @Test
    public void testFizzBuzzNumbersStep()
    {
        // GIVEN
        Integer i = 0; // start value, inclusive

        while (nums.hasNext())
        {
            // WHEN
            i = i + 1; // step size

            // THEN
            assertEquals(i, nums.next());
        }
    }
}
