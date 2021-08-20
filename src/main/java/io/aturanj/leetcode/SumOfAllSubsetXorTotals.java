package io.aturanj.leetcode;

/**
 * https://leetcode.com/problems/sum-of-all-subset-xor-totals/
 */
public class SumOfAllSubsetXorTotals {

    public int subsetXORSum(int[] nums) {
        return calculate(nums, 0, 0); // nums,index,sum
    }

    private int calculate(int[] nums, int index, int sum) {
        if (index == nums.length) {
            return sum;
        }

        return calculate(nums, index + 1, nums[index] ^ sum) + calculate(nums, index + 1, sum);
    }

    public static void main(String[] args) {
        var calculate = new SumOfAllSubsetXorTotals();
        var result = calculate.subsetXORSum(new int[]{3, 4, 5, 6, 7, 8});
        System.out.println("result = " + result);
    }
}
