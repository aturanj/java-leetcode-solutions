package io.aturanj.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://leetcode.com/problems/length-of-last-word/
 */
public class LengthOfLastWord {

    public int lengthOfLastWord(String s) {
        var sArray = s.split(" ");
        return sArray[sArray.length - 1].length();
    }

    public static void main(String[] args) {
        var lengthOfLastWord = new LengthOfLastWord();
        var result = lengthOfLastWord
                .lengthOfLastWord("   fly me   to   the moon  ");
        System.out.println("result = " + result);
        assertEquals(4, result);
    }
}
