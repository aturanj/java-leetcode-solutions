package io.aturanj.leetcode;

/**
 * https://leetcode.com/problems/find-peak-element/
 */
public class FindPeakElement {

    public int findPeakElement(int[] nums) {
        for (var i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                return i - 1;
            }
        }

        return nums.length - 1;
    }

    public static void main(String[] args) {
        var findPeakElement = new FindPeakElement();
        var result = findPeakElement.findPeakElement(new int[]{1, 2, 1, 3, 5, 6, 4});
        System.out.println("result = " + result);
    }
}
