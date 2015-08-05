package com.trev.fizzbuzz.template;

import java.util.Iterator;
import java.util.stream.IntStream;

public class FizzBuzzTemplate
{

    public void doFizzBuzz()
    {
        for (final Integer num : getFizzBuzzNumbers())
        {
            final String msg = getFizzBuzzText(num);
            printFizzBuzz(msg);
        }
    }

    protected Iterable<Integer> getFizzBuzzNumbers()
    {
        final IntStream stream = IntStream.range(1, 101);
        return new Iterable<Integer>()
        {

            @Override
            public Iterator<Integer> iterator()
            {
                return stream.iterator();
            }

        };
    }

    protected void printFizzBuzz(final String msg)
    {
        System.out.println(msg);
    }

    protected String getFizzBuzzText(final int num)
    {
        if (isDividable(num, 15))
        {
            return "FizzBuzz";
        }
        if (isDividable(num, 5))
        {
            return "Buzz";
        }
        if (isDividable(num, 3))
        {
            return "Fizz";
        }
        return Integer.toString(num);
    }

    private boolean isDividable(final int num, final int div)
    {
        return num % div == 0;
    }
}
