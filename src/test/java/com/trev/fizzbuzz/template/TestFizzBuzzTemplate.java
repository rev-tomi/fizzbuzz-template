package com.trev.fizzbuzz.template;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestFizzBuzzTemplate
{

    private static class TestFizzBuzz extends FizzBuzzTemplate
    {

        private final List<String> printed = new ArrayList<String>();

        @Override
        protected Iterable<Integer> getFizzBuzzNumbers()
        {
            return Arrays.asList(1, 2, 3);
        }

        @Override
        protected void printFizzBuzz(final String msg)
        {
            printed.add(msg);
        }

        @Override
        protected String getFizzBuzzText(final int num)
        {
            return "TEST";
        }
    }

}
