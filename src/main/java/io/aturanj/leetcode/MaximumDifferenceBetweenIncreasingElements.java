package io.aturanj.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://leetcode.com/problems/maximum-difference-between-increasing-elements/
 */
public class MaximumDifferenceBetweenIncreasingElements {

    public int maximumDifference(int[] nums) {

        var maxDiff = -1;

        for (var i = 0; i < nums.length; i++) {
            for (var j = 0; j < nums.length; j++) {
                if (i < j && nums[i] < nums[j] && nums[j] - nums[i] > maxDiff) {
                    maxDiff = nums[j] - nums[i];
                }
            }
        }
        return maxDiff;
    }

    public static void main(String[] args) {
        var maxDifferent = new MaximumDifferenceBetweenIncreasingElements();
        var result = maxDifferent.maximumDifference(new int[]{7, 1, 5, 4});
        System.out.println("result = " + result);
        assertEquals(4, result);
    }
}
