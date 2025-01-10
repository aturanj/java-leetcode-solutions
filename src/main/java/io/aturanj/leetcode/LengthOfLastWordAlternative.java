package io.aturanj.leetcode;

import java.util.Arrays;
import java.util.LinkedList;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://leetcode.com/problems/length-of-last-word
 */
public class LengthOfLastWordAlternative {

    public int lengthOfLastWord(String s) {

        var list = new LinkedList<String>(Arrays.asList(s.split(" ")));
        return list.getLast().length();
    }

    public static void main(String[] args) {
        var lengthOfLastWord = new LengthOfLastWordAlternative();
        var result = lengthOfLastWord.lengthOfLastWord("Hello World");
        assertEquals(5, result);
    }
}
