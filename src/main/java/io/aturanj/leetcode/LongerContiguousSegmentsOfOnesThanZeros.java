package io.aturanj.leetcode;

import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertFalse;

/**
 * https://leetcode.com/problems/longer-contiguous-segments-of-ones-than-zeros/
 */
public class LongerContiguousSegmentsOfOnesThanZeros {

    public boolean checkZeroOnes(String s) {
        var onesArray = s.split("0");
        var zerosArray = s.split("1");

        int onesMax = Arrays.stream(onesArray).mapToInt(x -> x.length()).max().orElse(0);
        int zerosMax = Arrays.stream(zerosArray).mapToInt(String::length).max().orElse(0);

        return onesMax > zerosMax;
    }

    public static void main(String[] args) {
        var longerContiguousSegments = new LongerContiguousSegmentsOfOnesThanZeros();
        var result = longerContiguousSegments.checkZeroOnes("110100010");
        System.out.println("result = " + result);
        assertFalse(result);
    }
}
