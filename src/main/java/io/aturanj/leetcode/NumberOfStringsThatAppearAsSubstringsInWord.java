package io.aturanj.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://leetcode.com/problems/number-of-strings-that-appear-as-substrings-in-word/
 */
public class NumberOfStringsThatAppearAsSubstringsInWord {

    public int numOfStrings(String[] patterns, String word) {

        var counter = 0;

        for (var item : patterns) {
            if (word.contains(item)) {
                counter++;
            }
        }

        return counter;
    }

    public static void main(String[] args) {
        var numbersOfStringInWord
                = new NumberOfStringsThatAppearAsSubstringsInWord();
        var result = numbersOfStringInWord.numOfStrings(
                new String[]{"a", "abc", "bc", "d"},
                "abc"
        );
        System.out.println("result = " + result);
        assertEquals(3, result);
    }
}
