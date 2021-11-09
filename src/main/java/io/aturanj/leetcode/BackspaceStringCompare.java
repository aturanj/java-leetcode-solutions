package io.aturanj.leetcode;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * https://leetcode.com/problems/backspace-string-compare/
 */
public class BackspaceStringCompare {

    public boolean backspaceCompare(String s, String t) {

        while (s.contains("#")) {
            var indexOne = s.indexOf("#");
            var sbOne = new StringBuilder(s);
            if (indexOne >= 0) {
                sbOne.deleteCharAt(indexOne);
            }
            if (indexOne - 1 >= 0) {
                sbOne.deleteCharAt(indexOne - 1);
            }
            s = sbOne.toString();
        }

        while (t.contains("#")) {
            var indexTwo = t.indexOf("#");
            var sbTwo = new StringBuilder(t);
            if (indexTwo >= 0) {
                sbTwo.deleteCharAt(indexTwo);
            }
            if (indexTwo - 1 >= 0) {
                sbTwo.deleteCharAt(indexTwo - 1);
            }
            t = sbTwo.toString();
        }

        System.out.println("s = " + s);
        System.out.println("t = " + t);

        return s.equals(t);
    }

    public static void main(String[] args) {
        var backspaceStringCompare = new BackspaceStringCompare();
        var result = backspaceStringCompare.backspaceCompare("a##c", "#a#c");
        System.out.println("result = " + result);
        assertTrue(result);
    }
}
