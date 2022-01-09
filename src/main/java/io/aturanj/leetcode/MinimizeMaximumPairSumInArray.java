package io.aturanj.leetcode;

import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://leetcode.com/problems/minimize-maximum-pair-sum-in-array/
 */
public class MinimizeMaximumPairSumInArray {

    public int minPairSum(int[] nums) {

        Arrays.sort(nums);
        var max = 0;
        for (int i = 0, j = nums.length - 1; i < nums.length && j >= 0 && i < j; i++, j--) {
            if (nums[i] + nums[j] > max) {
                max = nums[i] + nums[j];
            }
        }

        return max;
    }

    public static void main(String[] args) {
        var maxPairSum = new MinimizeMaximumPairSumInArray();
        var result = maxPairSum.minPairSum(new int[]{3, 5, 2, 3});
        System.out.println("result = " + result);
        assertEquals(7, result);
    }
}
