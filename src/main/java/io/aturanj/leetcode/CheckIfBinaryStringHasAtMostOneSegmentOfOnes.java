package io.aturanj.leetcode;

import org.junit.jupiter.api.Assertions;

/**
 * https://leetcode.com/problems/check-if-binary-string-has-at-most-one-segment-of-ones/s
 */
public class CheckIfBinaryStringHasAtMostOneSegmentOfOnes {

    public boolean checkOnesSegment(String s) {
        if (s.isEmpty()) {
            return false;
        }
        return s.split("0").length == 1;
    }

    public static void main(String[] args) {
        var checkOnes = new CheckIfBinaryStringHasAtMostOneSegmentOfOnes();
        var result = checkOnes.checkOnesSegment("1100");
        System.out.println("result = " + result);
        Assertions.assertTrue(result);
    }
}
