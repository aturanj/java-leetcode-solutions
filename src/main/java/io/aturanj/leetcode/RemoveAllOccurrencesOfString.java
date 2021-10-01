package io.aturanj.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://leetcode.com/problems/remove-all-occurrences-of-a-substring/
 */
public class RemoveAllOccurrencesOfString {

    public String removeOccurrences(String s, String part) {
        if (s.contains(part)) {
            s = removeOccurrences(s.replaceFirst(part, ""), part);
        }
        return s;
    }

    public static void main(String[] args) {
        var removeAllOccurrencesOfString = new RemoveAllOccurrencesOfString();
        var result = removeAllOccurrencesOfString.removeOccurrences("daabcbaabcbc", "abc");
        System.out.println("result = " + result);
        assertEquals(result, "dab");
    }
}
