package io.aturanj.leetcode;

/**
 * https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/
 */
public class CheckIfTwoStringArraysAreEquivalent {

    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {

        var sbOne = new StringBuilder();

        for (var item : word1) {
            sbOne.append(item);
        }

        var sbTwo = new StringBuilder();

        for (var item : word2) {
            sbTwo.append(item);
        }

        return sbOne.toString().equals(sbTwo.toString());
    }

    public static void main(String[] args) {
        var check = new CheckIfTwoStringArraysAreEquivalent();
        var result = check.arrayStringsAreEqual(
                new String[]{"ab", "c"},
                new String[]{"a", "bc"});
        System.out.println("result = " + result);
    }
}
