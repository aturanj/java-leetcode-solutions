package io.aturanj.leetcode;

import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * https://leetcode.com/problems/search-in-rotated-sorted-array-ii/
 */
public class SearchInRotatedSortedArrayII {

    public boolean search(int[] nums, int target) {
        return Arrays.stream(nums).anyMatch(x -> x == target);
    }

    public static void main(String[] args) {
        var searchInRotatedSortedArrayII = new SearchInRotatedSortedArrayII();
        var result = searchInRotatedSortedArrayII.search(new int[]{2, 5, 6, 0, 0, 1, 2}, 0);
        System.out.println("result = " + result);
        assertTrue(result);
    }
}
