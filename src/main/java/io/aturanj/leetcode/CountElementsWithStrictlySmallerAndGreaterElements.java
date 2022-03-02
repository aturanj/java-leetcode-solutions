package io.aturanj.leetcode;

import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://leetcode.com/problems/count-elements-with-strictly-smaller-and-greater-elements/
 */
public class CountElementsWithStrictlySmallerAndGreaterElements {

    public int countElements(int[] nums) {

        var counter = 0;
        Arrays.sort(nums);

        for (var item : nums) {
            if (item < nums[nums.length - 1] && item > nums[0]) {
                counter++;
            }
        }

        return counter;
    }

    public static void main(String[] args) {
        var countElements = new CountElementsWithStrictlySmallerAndGreaterElements();
        var result = countElements.countElements(new int[]{-3, 3, 3, 90});
        System.out.println("result = " + result);
        assertEquals(2, result);
    }
}
