package io.aturanj.leetcode;

import java.util.HashSet;

/**
 * https://leetcode.com/problems/find-the-duplicate-number/
 */
public class FindTheDuplicateNumber {

    public int findDuplicate(int[] nums) {

        var set = new HashSet();

        for (var item : nums) {
            if (!set.add(item)) {
                return item;
            }
        }

        return nums[0];
    }

    public static void main(String[] args) {
        var duplicateNumber = new FindTheDuplicateNumber();
        var result = duplicateNumber.findDuplicate(new int[]{1, 3, 4, 2, 2});
        System.out.println("result = " + result);
    }
}
