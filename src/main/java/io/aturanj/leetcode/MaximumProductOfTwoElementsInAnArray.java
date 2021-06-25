package io.aturanj.leetcode;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/
 */
public class MaximumProductOfTwoElementsInAnArray {

    public int maxProduct(int[] nums) {
        var length = nums.length;
        Arrays.sort(nums);
        var numberOne = nums[length - 1];
        var numberTwo = nums[length - 2];
        return (numberOne - 1) * (numberTwo - 1);
    }

    public static void main(String[] args) {
        MaximumProductOfTwoElementsInAnArray maximumProduct
                = new MaximumProductOfTwoElementsInAnArray();
        var result = maximumProduct.maxProduct(new int[]{3, 4, 5, 2});
        System.out.println("result = " + result);
    }
}
