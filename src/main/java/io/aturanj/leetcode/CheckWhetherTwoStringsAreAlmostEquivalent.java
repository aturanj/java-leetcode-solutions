package io.aturanj.leetcode;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * https://leetcode.com/problems/check-whether-two-strings-are-almost-equivalent/
 */
public class CheckWhetherTwoStringsAreAlmostEquivalent {

    public boolean checkAlmostEquivalent(String word1, String word2) {

        for (var letter : word1.toCharArray()) {

            var sizeOne = word1.length() - word1.replace("" + letter, "").length();
            var sizeTwo = word2.length() - word2.replace("" + letter, "").length();

            if (Math.abs(sizeOne - sizeTwo) > 3) {
                return false;
            }
        }

        for (var letter : word2.toCharArray()) {

            var sizeOne = word1.length() - word1.replace("" + letter, "").length();
            var sizeTwo = word2.length() - word2.replace("" + letter, "").length();

            if (Math.abs(sizeOne - sizeTwo) > 3) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        var checkEquality = new CheckWhetherTwoStringsAreAlmostEquivalent();
        var result = checkEquality.checkAlmostEquivalent("abcdeef", "abcdeef");
        System.out.println("result = " + result);
        assertTrue(result);
    }
}
