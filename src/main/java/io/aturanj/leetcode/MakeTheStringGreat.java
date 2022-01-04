package io.aturanj.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://leetcode.com/problems/make-the-string-great/
 */
public class MakeTheStringGreat {

    public String makeGood(String s) {

        var sb = new StringBuilder(s);

        var isChanged = false;

        for (var i = 1; i < sb.length(); i++) {
            if (Character.toUpperCase(sb.charAt(i)) == Character.toUpperCase(sb.charAt(i - 1))
                    && Character.isUpperCase(sb.charAt(i)) != Character.isUpperCase(sb.charAt(i - 1))) {
                sb.setCharAt(i, '_');
                sb.setCharAt(i - 1, '_');

                isChanged = true;
            }
        }

        var sNew = sb.toString().replace("_", "");

        if (isChanged) {
            sNew = makeGood(sNew);
        }

        return sNew;
    }

    public static void main(String[] args) {
        var makeTheStringGreat = new MakeTheStringGreat();
        var result = makeTheStringGreat.makeGood("leEeetcode");
        System.out.println("result = " + result);
        assertEquals("leetcode", result);
    }
}
