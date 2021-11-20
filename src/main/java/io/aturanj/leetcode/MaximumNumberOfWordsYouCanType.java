package io.aturanj.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://leetcode.com/problems/maximum-number-of-words-you-can-type/
 */
public class MaximumNumberOfWordsYouCanType {

    public int canBeTypedWords(String text, String brokenLetters) {

        var words = text.split(" ");
        var counter = 0;

        for (var word : words) {

            var isBrokenWord = false;

            for (var letter : brokenLetters.toCharArray()) {
                if (word.contains("" + letter)) {
                    isBrokenWord = true;
                    break;
                }
            }

            if (!isBrokenWord) {
                counter++;
            }
        }

        return counter;
    }

    public static void main(String[] args) {
        var maximumNumberOfWordsYouCanType = new MaximumNumberOfWordsYouCanType();
        var result = maximumNumberOfWordsYouCanType.canBeTypedWords(
                "hello world",
                "ad"
        );
        System.out.println("result = " + result);
        assertEquals(1, result);
    }
}
