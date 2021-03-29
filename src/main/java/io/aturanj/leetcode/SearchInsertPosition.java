package io.aturanj.leetcode;

/**
 * https://leetcode.com/problems/search-insert-position
 */
public class SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {

        if (target <= nums[0]) {
            return 0;//target should be the first element of array
        }

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == target || (nums[i] > target && i > 0)) {
                return i;
            }
        }

        return nums.length; //target should be the last element of array
    }

    public static void main(String[] args) {

        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();
        var result = searchInsertPosition.searchInsert(new int[]{1, 3, 5, 6}, 4);

        System.out.println("result = " + result);
    }
}
