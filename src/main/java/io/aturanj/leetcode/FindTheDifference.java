package io.aturanj.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://leetcode.com/problems/find-the-difference/
 */
public class FindTheDifference {

    public char findTheDifference(String s, String t) {
        for (var character : s.toCharArray()) {
            t = t.replaceFirst(character + "", "");
        }
        return t.charAt(0);
    }

    public static void main(String[] args) {
        var findTheDifference = new FindTheDifference();
        var result = findTheDifference.findTheDifference("abcd", "abcde");
        System.out.println("result = " + result);
        assertEquals(result, 'e');
    }
}
