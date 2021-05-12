package io.aturanj.leetcode;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/reverse-string/
 */
public class ReverseString {

    public void reverseString(char[] s) {

        for (int i = 0; i < s.length / 2; i++) {

            char a = s[i];
            char b = s[s.length - 1 - i];

            if (i != s.length - i) {
                s[i] = b;
                s[s.length - 1 - i] = a;
            }
        }

        System.out.println("s = " + Arrays.toString(s));
    }

    public static void main(String[] args) {
        ReverseString reverseString = new ReverseString();
        reverseString.reverseString(new char[]{'h', 'e', 'l', 'l', 'o'});
    }
}
