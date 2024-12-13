package io.aturanj.leetcode;

import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://leetcode.com/problems/count-the-number-of-vowel-strings-in-range/
 */
public class CountTheNumberOfVowelStringsInRange {

    public int vowelStrings(String[] words, int left, int right) {

        var count = 0;
        var list = Arrays.asList(new Character[]{'a', 'e', 'u', 'i', 'o'});

        for (var i = 0; i < words.length; i++) {
            if (i >= left && i <= right) {
                if (list.contains(words[i].charAt(0)) && list.contains(words[i].charAt(words[i].length() - 1))) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        var vowelStringsInRange = new CountTheNumberOfVowelStringsInRange();
        var result = vowelStringsInRange.vowelStrings(new String[]{"hey", "aeo", "mu", "ooo", "artro"}, 1, 4);
        var expected = 3;
        assertEquals(expected, result);
    }
}
