package io.aturanj.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://leetcode.com/problems/decrypt-string-from-alphabet-to-integer-mapping/
 */
public class DecryptStringFromAlphabetToIntegerMapping {

    public String freqAlphabets(String s) {

        var charSetOne = "abcdefghi";
        var charSetTwo = "jklmnopqrstuvwxyz";

        var sb = new StringBuilder();
        var current = "";
        var prev = "";
        var check = false;

        /**
         * TODO: Needs to be revised
         */
        for (var i = s.length() - 1; i > 0; i += 0) {

            System.out.println(i);

            if (s.charAt(i) == '#') {
                prev = s.substring(i - 2, i - 1);

                System.out.println("prev1= " + prev);

                i -= 3;
            } else {
                current = s.substring(i - 1, i + 1);
                i -= 2;
            }

            if (!current.equals("") && check == false) {
                check = true;
                for (var ch : current.toCharArray()) {
                    sb.append(charSetOne.charAt(Integer.valueOf("" + ch) - 1));
                }
            } else {
                System.out.println("prev2= " + prev);
                sb.append(charSetTwo.charAt(Integer.valueOf(prev) - 10));
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        var decryptString = new DecryptStringFromAlphabetToIntegerMapping();
        var result = decryptString.freqAlphabets("10#11#12");
        System.out.println("result = " + result);
        assertEquals("jkab", result);
    }
}
