package io.aturanj.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://leetcode.com/problems/largest-odd-number-in-string/
 */
public class LargestOddNumberInString {

    public String largestOddNumber(String num) {
        for (var i = num.length() - 1; i >= 0; i--) {
            if (num.charAt(i) % 2 == 1) {
                return num.substring(0, i + 1);
            }
        }
        return "";
    }

    public static void main(String[] args) {
        var largestOddNumberInString = new LargestOddNumberInString();
        var result = largestOddNumberInString.largestOddNumber("52");
        System.out.println("result = " + result);
        assertEquals("5", result);
    }
}
