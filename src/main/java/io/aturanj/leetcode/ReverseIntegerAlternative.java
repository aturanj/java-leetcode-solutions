package io.aturanj.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://leetcode.com/problems/reverse-integer/
 */
public class ReverseIntegerAlternative {

    public int reverse(int x) {

        var signum = Math.signum(x);
        var text = new StringBuilder(String.valueOf(x).replaceAll("-", "")).reverse().toString();
        var longValue = Long.valueOf(text);

        if (longValue > Integer.MAX_VALUE || longValue < Integer.MIN_VALUE) {
            return 0;
        }

        return (int) signum * Integer.parseInt(text);
    }

    public static void main(String[] args) {

        var reverseInteger = new ReverseIntegerAlternative();
        var result = reverseInteger.reverse(-123);

        System.out.println("result = " + result);
        
        assertEquals(-321, result);
    }
}
