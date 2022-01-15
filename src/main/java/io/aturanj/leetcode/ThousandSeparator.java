package io.aturanj.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://leetcode.com/problems/thousand-separator/
 */
public class ThousandSeparator {

    public String thousandSeparator(int n) {

        var number = "" + n;
        var sb = new StringBuilder();

        if (number.length() > 3) {
            for (var i = number.length() - 1; i >= 0; i--) {

                sb.append(number.charAt(i));

                if ((number.length() - i) % 3 == 0 && i != 0) {
                    sb.append(".");
                }
            }
        } else {
            return number;
        }

        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        var thousandSeparator = new ThousandSeparator();
        var result = thousandSeparator.thousandSeparator(1234);
        System.out.println("result = " + result);
        assertEquals("1.234", result);
    }
}
