package com.trev.fizzbuzz.template;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestFizzBuzzTemplate
{

    private TestFizzBuzz sut;

    @BeforeMethod
    public void setUp()
    {
        sut = new TestFizzBuzz();
    }

    @Test
    public void testFizzBuzzTemplate()
    {
        // WHEN
        sut.doFizzBuzz();

        // THEN
        assertEquals(sut.printed, Arrays.asList("TEST", "TEST", "TEST"));
    }

    private static class TestFizzBuzz extends FizzBuzzTemplate
    {

        private final List<String> printed = new ArrayList<String>();

        @Override
        protected Iterable<Integer> getFizzBuzzNumbers()
        {
            return Arrays.asList(1, 2, 3);
        }

        @Override
        protected void printFizzBuzz(final String msg)
        {
            printed.add(msg);
        }

        @Override
        protected String getFizzBuzzText(final int num)
        {
            return "TEST";
        }
    }

}
