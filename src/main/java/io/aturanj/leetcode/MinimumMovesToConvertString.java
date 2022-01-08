package io.aturanj.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://leetcode.com/problems/minimum-moves-to-convert-string/
 */
public class MinimumMovesToConvertString {

    public int minimumMoves(String s) {

        var counter = 0;

        for (var i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'X') {
                counter++;
                i += 2;
            }
        }

        return counter;
    }

    public static void main(String[] args) {
        var minimumMovesToConvertString = new MinimumMovesToConvertString();
        var result = minimumMovesToConvertString.minimumMoves("XXOX");
        System.out.println("result = " + result);
        assertEquals(2, result);
    }
}
