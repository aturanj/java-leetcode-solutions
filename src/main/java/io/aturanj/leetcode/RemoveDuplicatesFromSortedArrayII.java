package io.aturanj.leetcode;

import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/
 */
public class RemoveDuplicatesFromSortedArrayII {

    public int removeDuplicates(int[] nums) {

        var counter = 1;

        for (var i = 1; i < nums.length; i++) {

            if (nums[i] == Integer.MAX_VALUE) {
                break;
            }

            if (nums[i] == nums[i - 1]) {
                counter++;
            } else {
                counter = 1;
            }

            if (counter > 2) {
                for (var j = i; j < nums.length; j++) {
                    if (j + 1 < nums.length) {
                        nums[j] = nums[j + 1];
                    }
                }

                i--;
                counter--;
                nums[nums.length - 1] = Integer.MAX_VALUE;
            }
        }

        return (int) Arrays.stream(nums).filter(x -> x != Integer.MAX_VALUE).count();
    }

    public static void main(String[] args) {
        var removeDuplicatesFromSortedArrayII = new RemoveDuplicatesFromSortedArrayII();
        var result = removeDuplicatesFromSortedArrayII.removeDuplicates(
                new int[]{0, 0, 1, 1, 1, 1, 2, 3, 3}
        );
        System.out.println("result = " + result);
        assertEquals(7, result);
    }
}
