package io.aturanj.leetcode;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/create-target-array-in-the-given-order/
 */
public class CreateTargetArrayInTheGivenOrder {

    public int[] createTargetArray(int[] nums, int[] index) {

        int length = nums.length;
        int[] targetArray = new int[length];

        for (int i = 0; i < length; i++) {

            var newIndex = index[i];

            //shift other items
            for (int j = length - 1; newIndex < j; j--) {
                targetArray[j] = targetArray[j - 1];
            }

            //insert new item
            targetArray[newIndex] = nums[i];
        }

        return targetArray;
    }

    public static void main(String[] args) {

        CreateTargetArrayInTheGivenOrder targetArrayInTheGivenOrder
                = new CreateTargetArrayInTheGivenOrder();

        var result = targetArrayInTheGivenOrder.createTargetArray(
                new int[]{0, 1, 2, 3, 4},
                new int[]{0, 1, 2, 2, 1});

        System.out.println("result = " + Arrays.toString(result));
    }
}
