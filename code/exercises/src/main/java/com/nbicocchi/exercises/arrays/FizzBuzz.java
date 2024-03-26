package com.nbicocchi.exercises.arrays;

public class FizzBuzz {
    public static String[] fizzBuzz(int start, int end) {
        if (start >= end || start < 0) {
            return new String[]{};
        }

        int j = 0;
        String[] dst = new String[end - start];
        for (int i = start; i < end; i++) {
            String s;
            if (i % 3 == 0 && i % 5 == 0) {
                s = "FizzBuzz";
            } else if (i % 3 == 0) {
                s = "Fizz";
            } else if (i % 5 == 0) {
                s = "Buzz";
            } else {
                s = Integer.toString(i);
            }
            dst[j++] = s;
        }
        return dst;
    }
}
