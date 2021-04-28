package io.aturanj.leetcode;

/**
 * https://leetcode.com/problems/maximum-subarray/
 */
public class MaximumSubarray {

    public int maxSubArray(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }

        int maxSum = nums[0];
        int sum = nums[0];

        for (int i = 1; i < nums.length; i++) {

            var item = nums[i];

            sum = Math.max(sum + item, item);

            maxSum = Math.max(maxSum, sum);

            System.out.println("Sum : " + sum + " MaxSum: " + maxSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {

        MaximumSubarray maximumSubarray = new MaximumSubarray();
        var result = maximumSubarray.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4});

        System.out.println("result = " + result);
    }
}
