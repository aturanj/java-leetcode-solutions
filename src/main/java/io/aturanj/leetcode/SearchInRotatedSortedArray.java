package io.aturanj.leetcode;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://leetcode.com/problems/search-in-rotated-sorted-array/
 */
public class SearchInRotatedSortedArray {

    public int search(int[] nums, int target) {

        if (!Arrays.stream(nums).anyMatch(x -> x == target)) {
            return -1;
        }

        var index = new AtomicInteger(0);
        IntStream.range(0, nums.length)
                .parallel().
                forEach(i -> {
                    if (nums[i] == target) {
                        index.set(i);
                    }
                });

        return index.get();
    }

    public static void main(String[] args) {
        var searchInRotatedSortedArray = new SearchInRotatedSortedArray();
        var result = searchInRotatedSortedArray
                .search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0);
        System.out.println("result = " + result);
        assertEquals(result, 4);
    }
}
