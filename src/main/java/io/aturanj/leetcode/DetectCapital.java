package io.aturanj.leetcode;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * https://leetcode.com/problems/detect-capital/
 */
public class DetectCapital {

    public boolean detectCapitalUse(String word) {

        if (word.length() <= 1) {
            return true;
        }

        if (Character.isUpperCase(word.charAt(0))) {
            if (Character.isUpperCase(word.charAt(1))) {
                for (var i = 2; i < word.length(); i++) {
                    if (!Character.isUpperCase(word.charAt(i))) {
                        return false;
                    }
                }
            } else {
                for (var i = 2; i < word.length(); i++) {
                    if (Character.isUpperCase(word.charAt(i))) {
                        return false;
                    }
                }
            }
        } else {
            for (var i = 1; i < word.length(); i++) {
                if (Character.isUpperCase(word.charAt(i))) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        var detectCapital = new DetectCapital();
        var result = detectCapital.detectCapitalUse("USA");
        System.out.println("result = " + result);
        assertTrue(result);
    }
}
