package com.trev.fizzbuzz.template;

public class FizzBuzzTemplate
{

    public String getFizzBuzzText(final int num)
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
