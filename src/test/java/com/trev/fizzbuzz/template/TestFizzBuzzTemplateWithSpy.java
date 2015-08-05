package com.trev.fizzbuzz.template;

import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;

import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.mockito.InOrder;
import org.mockito.Mockito;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestFizzBuzzTemplateWithSpy
{

    private FizzBuzzTemplate sut;
    private Stream<Integer> oneTwoThree;

    @BeforeMethod
    public void setUp()
    {
        final FizzBuzzTemplate template = new FizzBuzzTemplate();
        sut = spy(template);
        oneTwoThree = IntStream.of(1, 2, 3).boxed();
        doReturn(oneTwoThree).when(sut).getFizzBuzzNumbers();
        doNothing().when(sut).printFizzBuzz(anyString());
    }

    @Test
    public void testStreamRetrieved()
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
        final InOrder order = Mockito.inOrder(sut);
        order.verify(sut).getFizzBuzzText(1);
        order.verify(sut).getFizzBuzzText(2);
        order.verify(sut).getFizzBuzzText(3);
    }

    @Test
    public void testMessagePrinted()
    {
        // GIVEN
        final String defaultMsg = "TEST";
        final Answer<String> numberedTestAnswer = new Answer<String>()
        {
            @Override
            public String answer(final InvocationOnMock invocation) throws Throwable
            {
                final Integer num = (Integer) invocation.getArguments()[0];
                return defaultMsg + " " + num;
            }
        };
        doAnswer(numberedTestAnswer).when(sut).getFizzBuzzText(anyInt());

        // WHEN
        sut.doFizzBuzz();

        // THEN
        final InOrder order = Mockito.inOrder(sut);
        order.verify(sut).printFizzBuzz(defaultMsg + " 1");
        order.verify(sut).printFizzBuzz(defaultMsg + " 2");
        order.verify(sut).printFizzBuzz(defaultMsg + " 3");
    }
}
