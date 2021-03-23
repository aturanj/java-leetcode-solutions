package io.aturanj.leetcode;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/valid-anagram/
 */
public class ValidAnagram {

    public boolean isAnagram(String s, String t) {

        if ("".equals(s) && "".equals(t)) {
            return true;
        }

        if (s.length() != t.length()) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {

            boolean contain = false;

            for (int j = 0; j < t.length(); j++) {

                if (Character.compare(s.charAt(i), t.charAt(j)) == 0) {

                    contain = true;

                    t = t.replaceFirst(String.valueOf(t.charAt(j)), "");

                    break;
                }
            }

            if (!contain) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        ValidAnagram validAnagram = new ValidAnagram();
        var result = validAnagram.isAnagram("anagram", "naagram");

        System.out.println("result = " + result);
    }

    public boolean isAnagramAlternative(String s, String t) {

        char ss[] = s.toCharArray();
        char tt[] = t.toCharArray();

        Arrays.sort(ss);
        Arrays.sort(tt);

        return Arrays.equals(ss, tt);
    }
}
