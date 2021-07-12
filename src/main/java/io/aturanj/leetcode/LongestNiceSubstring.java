package io.aturanj.leetcode;

import java.util.HashSet;

/**
 * https://leetcode.com/problems/longest-nice-substring/
 */
public class LongestNiceSubstring {

    public String longestNiceSubstring(String s) {

        var set = new HashSet<Character>();

        for (var item : s.toCharArray()) {
            set.add(item);
        }

        for (var i = 0; i < s.length(); i++) {

            if (!set.contains(Character.toUpperCase(s.charAt(i)))
                    || !set.contains(Character.toLowerCase(s.charAt(i)))) {

                var left = longestNiceSubstring(s.substring(0, i));
                var right = longestNiceSubstring(s.substring(i + 1));

                return left.length() >= right.length() ? left : right;
            }
        }

        return s;
    }

    public static void main(String[] args) {

        LongestNiceSubstring niceSubstring = new LongestNiceSubstring();
        var result = niceSubstring.longestNiceSubstring("YazaAay");

        System.out.println("result = " + result);
    }
}
