package io.aturanj.leetcode;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/running-sum-of-1d-array/
 */
public class RunningSumOf1dArray {

    public int[] runningSum(int[] nums) {

        int[] resultArray = new int[nums.length];
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            resultArray[i] = sum;
        }

        return resultArray;
    }

    public static void main(String[] args) {

        RunningSumOf1dArray rsoa = new RunningSumOf1dArray();
        var result = rsoa.runningSum(new int[]{3, 1, 2, 10, 1});

        System.out.println("result = " + Arrays.toString(result));

    }
}
