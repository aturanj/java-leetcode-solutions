package io.aturanj.leetcode;

/**
 * https://leetcode.com/problems/split-a-string-in-balanced-strings/
 */
public class SplitStringInBalancedString {

    public int balancedStringSplit(String s) {

        int balance = 0;
        int counter = 0;

        for (char item : s.toCharArray()) {
            if ('L' == item) {
                balance++;
            } else {
                balance--;
            }

            if (balance == 0) {
                counter++;
            }
        }

        return counter;
    }

    public static void main(String[] args) {

        SplitStringInBalancedString splitStringInBalancedString
                = new SplitStringInBalancedString();

        var result = splitStringInBalancedString.balancedStringSplit("RLRRLLRLRL");

        System.out.println("result = " + result);
    }
}
