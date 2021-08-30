package io.aturanj.leetcode;

import java.util.HashSet;

/**
 * https://leetcode.com/problems/n-repeated-element-in-size-2n-array/
 */
public class NRepeatedElementInSize2NArray {

    public int repeatedNTimes(int[] nums) {

        var set = new HashSet<Integer>();

        for (var item : nums) {
            if (!set.add(item)) {
                return item;
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        var nRepeatedElement = new NRepeatedElementInSize2NArray();
        var result = nRepeatedElement.repeatedNTimes(
                new int[]{5, 1, 5, 2, 5, 3, 5, 4}
        );
        System.out.println("result = " + result);
    }
}
