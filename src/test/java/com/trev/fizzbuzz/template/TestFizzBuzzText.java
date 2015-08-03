package com.trev.fizzbuzz.template;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class TestFizzBuzzText
{

    @Test
    public void testFizzBuzzText()
    {
        // GIVEN
        final FizzBuzzTemplate sut = new FizzBuzzTemplate();

        // WHEN
        final String text = sut.getFizzBuzzText(1);

        // THEN
        assertEquals("1", text);
    }

}
