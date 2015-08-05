package com.trev.fizzbuzz.template;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FizzBuzzTemplate
{

    public void doFizzBuzz()
    {
        getFizzBuzzNumbers().forEach(num ->
        {
            final String msg = getFizzBuzzText(num);
            printFizzBuzz(msg);
        });
    }

    protected Stream<Integer> getFizzBuzzNumbers()
    {
        return IntStream.range(1, 101).boxed();
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
