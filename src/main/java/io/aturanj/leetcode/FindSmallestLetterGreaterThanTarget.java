package io.aturanj.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://leetcode.com/problems/find-smallest-letter-greater-than-target/
 */
public class FindSmallestLetterGreaterThanTarget {

    public char nextGreatestLetter(char[] letters, char target) {
        for (var item : letters) {
            if (item > target) {
                return item;
            }
        }

        return letters[0];
    }

    public static void main(String[] args) {
        var findLetter = new FindSmallestLetterGreaterThanTarget();
        var result = findLetter.nextGreatestLetter(new char[]{'c', 'f', 'j'}, 'a');
        System.out.println("result = " + result);
        assertEquals('c', result);
    }
}
