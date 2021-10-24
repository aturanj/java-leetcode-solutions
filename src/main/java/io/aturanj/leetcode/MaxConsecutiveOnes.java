package io.aturanj.leetcode;

import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

/**
 * https://leetcode.com/problems/max-consecutive-ones/
 */
public class MaxConsecutiveOnes {

    public int findMaxConsecutiveOnes(int[] nums) {

        var sb = new StringBuilder();
        Arrays.stream(nums).forEach(x -> sb.append(x));

        var onesArray = sb.toString().split("0");

        return Arrays.stream(onesArray)
                .mapToInt(x -> x.length())
                .max()
                .orElse(0);
    }

    public static void main(String[] args) {
        var maxConsecutiveOnes = new MaxConsecutiveOnes();
        var result = maxConsecutiveOnes.findMaxConsecutiveOnes(new int[]{1, 1, 0, 1, 1, 1});
        System.out.println("result = " + result);
        Assertions.assertEquals(3, result);
    }
}
