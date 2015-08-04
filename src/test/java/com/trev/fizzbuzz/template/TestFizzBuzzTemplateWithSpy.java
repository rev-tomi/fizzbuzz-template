package com.trev.fizzbuzz.template;

import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;

import java.util.Arrays;
import java.util.List;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestFizzBuzzTemplateWithSpy
{

    private FizzBuzzTemplate sut;

    @BeforeMethod
    public void setUp()
    {
        final FizzBuzzTemplate template = new FizzBuzzTemplate();
        sut = spy(template);
    }

    @Test
    public void testIteratorRetrieved()
    {
        // GIVEN
        final List<Integer> oneTwoThree = Arrays.asList(1, 2, 3);
        doReturn(oneTwoThree).when(sut).getFizzBuzzNumbers();

        // WHEN
        sut.doFizzBuzz();

        // THEN
        verify(sut).getFizzBuzzNumbers();
    }
}
