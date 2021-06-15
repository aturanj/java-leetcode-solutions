package io.aturanj.leetcode;

/**
 * https://leetcode.com/problems/to-lower-case/
 */
public class ToLowerCase {

    public String toLowerCase(String s) {
        return s.toLowerCase();
    }

    public static void main(String[] args) {
        ToLowerCase tlc = new ToLowerCase();
        var result = tlc.toLowerCase("LOvELy");
        System.out.println("result = " + result);
    }
}
