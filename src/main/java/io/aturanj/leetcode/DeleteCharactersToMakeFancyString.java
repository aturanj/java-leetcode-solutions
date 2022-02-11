package io.aturanj.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://leetcode.com/problems/delete-characters-to-make-fancy-string/
 */
public class DeleteCharactersToMakeFancyString {

    public String makeFancyString(String s) {

        if (s.length() < 3) {
            return s;
        }

        var sb = new StringBuilder();
        sb.append(s.substring(0, 2));

        for (var i = 2; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(i - 1) || s.charAt(i - 1) != s.charAt(i - 2)) {
                sb.append(s.charAt(i));
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        var fancyStrings = new DeleteCharactersToMakeFancyString();
        var result = fancyStrings.makeFancyString("aaabaaaa");
        System.out.println("result = " + result);
        assertEquals("aabaa", result);
    }
}
