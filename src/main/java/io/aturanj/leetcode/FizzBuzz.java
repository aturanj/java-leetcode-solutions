package io.aturanj.leetcode;

import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.com/problems/fizz-buzz/
 */
public class FizzBuzz {

    public List<String> fizzBuzz(int n) {

        String[] array = new String[n];

        for (int i = 1; i <= n; i++) {

            if (i % 5 == 0 && i % 3 == 0) {
                array[i - 1] = "FizzBuzz";
            } else if (i % 3 == 0) {
                array[i - 1] = "Fizz";
            } else if (i % 5 == 0) {
                array[i - 1] = "Buzz";
            } else {
                array[i - 1] = String.valueOf(i);
            }
        }

        return Arrays.asList(array);
    }

    public static void main(String[] args) {

        FizzBuzz fizzBuzz = new FizzBuzz();
        var result = fizzBuzz.fizzBuzz(15);

        result.forEach(x -> {
            System.out.println(x);
        });
    }
}
