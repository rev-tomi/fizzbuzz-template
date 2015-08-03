package com.trev.fizzbuzz.template;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestFizzBuzzText
{

    private FizzBuzzTemplate sut;

    @BeforeMethod
    void setUp()
    {
        sut = new FizzBuzzTemplate();
    }

    @Test(dataProvider = "fizzBuzzText")
    public void testFizzBuzzText(final Integer num, final String expected)
    {
        // WHEN
        final String text = sut.getFizzBuzzText(num);

        // THEN
        assertEquals(text, expected);
    }

    @DataProvider(name = "fizzBuzzText")
    private Object[][] getFizzBuzzTextTestData()
    {
        return new Object[][]{
            new Object[]{1, "1"},
        };
    }

}
