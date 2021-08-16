package io.aturanj.leetcode;

/**
 * https://leetcode.com/problems/minimum-operations-to-make-the-array-increasing/
 */
public class MinimumOperationsToMakeTheArrayIncreasing {

    public int minOperations(int[] nums) {

        var operationCount = 0;

        for (var i = 1; i < nums.length; i++) {
            if (nums[i] <= nums[i - 1]) {
                var diff = nums[i - 1] - nums[i] + 1;
                nums[i] += diff;
                operationCount += diff;
            }
        }

        return operationCount;
    }

    public static void main(String[] args) {
        var makeIncreasing = new MinimumOperationsToMakeTheArrayIncreasing();
        var result = makeIncreasing.minOperations(
                new int[]{1, 5, 2, 4, 1}
        );
        System.out.println("result = " + result);
    }
}
