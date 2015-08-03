package com.trev.fizzbuzz.template;

public class FizzBuzzTemplate
{

    public String getFizzBuzzText(final int num)
    {
        if (num % 15 == 0)
        {
            return "FizzBuzz";
        }
        if (num % 5 == 0)
        {
            return "Buzz";
        }
        if (num % 3 == 0)
        {
            return "Fizz";
        }
        return Integer.toString(num);
    }
}
