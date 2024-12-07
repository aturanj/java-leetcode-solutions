package io.aturanj.leetcode;

import java.util.HashSet;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/
 */
public class LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {

        if (s.isEmpty()) {
            return 0;
        }

        int maxLength = 0;
        int left = 0;
        var set = new HashSet<Character>();

        for (int right = 0; right < s.length(); right++) {

            char current = s.charAt(right);

            while (set.contains(current)) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(current);
            maxLength = Math.max(maxLength, right - left + 1);

            System.out.println("right: " + right + " left: " + left + " max-length: " + maxLength);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        var longestSubstring = new LongestSubstringWithoutRepeatingCharacters();
        var result = longestSubstring.lengthOfLongestSubstring("pwwkew");
        System.out.println("result = " + result);
        assertEquals(3, result);
    }
}
