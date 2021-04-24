package io.aturanj.leetcode;

/**
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 */
public class RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {

        int index = 1;

        for (int k = 0; k < nums.length - 1; k++) {
            if (nums[k] != nums[k + 1]) {
                nums[index++] = nums[k + 1];
            }
        }

        return index;
    }

    public static void main(String[] args) {

        RemoveDuplicatesFromSortedArray rdfsa
                = new RemoveDuplicatesFromSortedArray();

        var result = rdfsa
                .removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4});

        System.out.println("result = " + result);
    }
}
