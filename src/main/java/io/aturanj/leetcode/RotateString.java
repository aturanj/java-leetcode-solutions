package io.aturanj.leetcode;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * https://leetcode.com/problems/rotate-string/
 */
public class RotateString {

    public boolean rotateString(String s, String goal) {

        for (var i = 0; i < s.length(); i++) {
            s = s.substring(1) + s.charAt(0);
            if (s.equals(goal)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        var rotateString = new RotateString();
        var result = rotateString.rotateString("abcde", "cdeab");
        System.out.println("result = " + result);
        assertTrue(result);
    }
}
