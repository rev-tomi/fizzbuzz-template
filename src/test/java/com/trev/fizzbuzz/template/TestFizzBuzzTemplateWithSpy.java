package com.trev.fizzbuzz.template;

import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;

import java.util.Arrays;
import java.util.List;

import org.mockito.internal.verification.Times;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestFizzBuzzTemplateWithSpy
{

    private FizzBuzzTemplate sut;
    private List<Integer> oneTwoThree;

    @BeforeMethod
    public void setUp()
    {
        final FizzBuzzTemplate template = new FizzBuzzTemplate();
        sut = spy(template);
        oneTwoThree = Arrays.asList(1, 2, 3);
        doReturn(oneTwoThree).when(sut).getFizzBuzzNumbers();
        doNothing().when(sut).printFizzBuzz(anyString());
    }

    @Test
    public void testIteratorRetrieved()
    {
        // WHEN
        sut.doFizzBuzz();

        // THEN
        verify(sut).getFizzBuzzNumbers();
    }

    @Test
    public void testTextGenerated()
    {
        // WHEN
        sut.doFizzBuzz();

        // THEN
        verify(sut).getFizzBuzzText(1);
        verify(sut).getFizzBuzzText(2);
        verify(sut).getFizzBuzzText(3);
    }

    @Test
    public void testMessagePrinted()
    {
        // GIVEN
        final String defaultMsg = "TEST";
        doReturn(defaultMsg).when(sut).getFizzBuzzText(anyInt());

        // WHEN
        sut.doFizzBuzz();

        // THEN
        verify(sut, new Times(3)).printFizzBuzz(defaultMsg);
    }
}
