package io.aturanj.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://leetcode.com/problems/find-first-palindromic-string-in-the-array/
 */
public class FindFirstPalindromicStringInTheArray {

    public String firstPalindrome(String[] words) {

        for (var word : words) {

            var isPalindromic = true;

            for (int i = 0, j = word.length() - 1; i < word.length() / 2; i++, j--) {
                if (Character.compare(word.charAt(i), word.charAt(j)) != 0) {
                    isPalindromic = false;
                }
            }

            if (isPalindromic) {
                return word;
            }
        }

        return "";
    }

    public static void main(String[] args) {
        var palindromicString = new FindFirstPalindromicStringInTheArray();
        var result = palindromicString.firstPalindrome(
                new String[]{"abc", "car", "ada", "racecar", "cool"}
        );
        System.out.println("result = " + result);
        assertEquals("ada", result);
    }
}
