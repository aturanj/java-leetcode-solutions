package io.aturanj.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://leetcode.com/problems/search-insert-position/
 */
public class SearchInterPositionAlternative {

    public int searchInsert(int[] nums, int target) {

        for (var i = 0; i < nums.length; i++) {
            if (nums[i] >= target) {
                return i;
            }
        }

        return nums.length;
    }

    public static void main(String[] args) {
        var searchInterPosition = new SearchInterPositionAlternative();
        var result = searchInterPosition.searchInsert(new int[]{1, 3, 5, 6}, 9);
        assertEquals(4, result);
    }
}
