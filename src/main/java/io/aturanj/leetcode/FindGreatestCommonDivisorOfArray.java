package io.aturanj.leetcode;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/find-greatest-common-divisor-of-array/
 */
public class FindGreatestCommonDivisorOfArray {

    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        return gcdEuclidian(nums[0], nums[nums.length - 1]);
    }

    private int gcdEuclidian(int a, int b) {
        if (b == 0) {
            return a;
        }
        System.out.println("a: " + a + " b: " + b);
        return gcdEuclidian(b, a % b);
    }

    public static void main(String[] args) {
        var findGCD = new FindGreatestCommonDivisorOfArray();
        var result = findGCD.findGCD(new int[]{7, 5, 6, 8, 3});
        System.out.println("result = " + result);
    }
}
