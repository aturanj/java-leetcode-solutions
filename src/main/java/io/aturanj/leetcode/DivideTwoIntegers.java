package io.aturanj.leetcode;

/**
 * https://leetcode.com/problems/divide-two-integers/
 */
public class DivideTwoIntegers {

    public int divide(int dividend, int divisor) {

        if (divisor == 1) {
            return dividend;
        }
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        var current = Math.abs((long) dividend);
        var newDivisor = Math.abs((long) divisor);
        var counter = 0;

        while (current >= newDivisor) {
            counter++;
            current -= newDivisor;
        }

        return (int) Math.signum(dividend) * (int) Math.signum(divisor) * counter;
    }
}
