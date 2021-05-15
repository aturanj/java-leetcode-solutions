package io.aturanj.leetcode;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/xor-operation-in-an-array/
 */
public class XorOperationInAnArray {

    public int xorOperation(int n, int start) {

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = start + 2 * i;
        }

        System.out.println("nums before XOR = " + Arrays.toString(nums));

        int result = 0;

        for (var item : nums) {
            result ^= item; // XOR
        }

        return result;
    }

    public static void main(String[] args) {
        XorOperationInAnArray xor = new XorOperationInAnArray();
        var result = xor.xorOperation(4, 3);

        System.out.println("result = " + result);
    }
}
