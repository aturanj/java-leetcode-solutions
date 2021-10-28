package io.aturanj.leetcode;

import org.junit.jupiter.api.Assertions;

/**
 * https://leetcode.com/problems/sum-of-digits-of-string-after-convert/
 */
public class SumOfDigitOfStringAfterConvert {

    public int getLucky(String s, int k) {

        var sb = new StringBuilder();
        for (var element : s.toCharArray()) {
            var index = Character.getNumericValue(element)
                    - Character.getNumericValue('a');
            sb.append(index + 1);
        }

        var total = 0;

        for (var i = 0; i < k; i++) {
            for (var j = 0; j < sb.length(); j++) {
                total += Integer.parseInt(sb.charAt(j) + "");
            }

            sb = new StringBuilder(total + "");
            total = 0;

            System.out.println(sb.toString());
        }

        return Integer.parseInt(sb.toString());
    }

    public static void main(String[] args) {
        var sumOfDigitOfStringAfterConvert = new SumOfDigitOfStringAfterConvert();
        var result = sumOfDigitOfStringAfterConvert.getLucky("zbax", 2);
        System.out.println("result = " + result);
        Assertions.assertEquals(8, result);
    }
}
