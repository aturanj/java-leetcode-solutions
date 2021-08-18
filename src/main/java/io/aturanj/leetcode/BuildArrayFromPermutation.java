package io.aturanj.leetcode;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * https://leetcode.com/problems/build-array-from-permutation/
 */
public class BuildArrayFromPermutation {

    public int[] buildArray(int[] nums) {

        var list = new ArrayList<Integer>();

        for (var i = 0; i < nums.length; i++) {
            list.add(nums[nums[i]]);
        }

        return list.stream().mapToInt(x -> x).toArray();
    }

    public static void main(String[] args) {
        var buildArrayFromPermutation = new BuildArrayFromPermutation();
        var result = buildArrayFromPermutation.buildArray(
                new int[]{0, 2, 1, 5, 3, 4}
        );
        System.out.println("result = " + Arrays.toString(result));
    }
}
