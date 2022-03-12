package io.aturanj.leetcode;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * https://leetcode.com/problems/check-if-numbers-are-ascending-in-a-sentence/
 */
public class CheckIfNumbersAreAscendingInASentence {

    public boolean areNumbersAscending(String s) {

        var words = s.split(" ");
        var prev = Integer.MIN_VALUE;

        for (var word : words) {

            if (Character.isDigit(word.charAt(0))) {

                var number = Integer.valueOf(word);

                if (number <= prev) {
                    return false;
                } else {
                    prev = number;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        var numbersInSentences = new CheckIfNumbersAreAscendingInASentence();
        var result = numbersInSentences.areNumbersAscending(
                "1 box has 3 blue 4 red 6 green and 12 yellow marbles"
        );
        System.out.println("result = " + result);
        assertTrue(result);
    }
}
