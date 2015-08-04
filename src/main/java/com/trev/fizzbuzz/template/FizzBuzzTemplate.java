package com.trev.fizzbuzz.template;

import java.util.Iterator;

public class FizzBuzzTemplate
{

    public void doFizzBuzz()
    {
        for (final Integer num : getFizzBuzzNumbers())
        {
            //                    printFizzBuzz(getFizzBuzzText(num));
        }
    }

    protected Iterable<Integer> getFizzBuzzNumbers()
    {
        final Iterator<Integer> iterator = new Iterator<Integer>()
        {

            private int current = 1;

            public boolean hasNext()
            {
                return current <= 100;
            }

            public Integer next()
            {
                return current++;
            }

            public void remove()
            {
                throw new UnsupportedOperationException("Read-Only Iterator");
            }

        };
        return new Iterable<Integer>()
        {

            public Iterator<Integer> iterator()
            {
                return iterator;
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
