package io.aturanj.leetcode;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * https://leetcode.com/problems/valid-mountain-array/
 */
public class ValidMountainArray {

    public boolean validMountainArray(int[] arr) {

        if (arr.length < 3 || arr[0] >= arr[1]) {
            return false;
        }

        var topPoint = 0;

        for (var i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1] && topPoint == 0) {
                topPoint = arr[i - 1];
            }
            if ((arr[i] == arr[i - 1]) || (topPoint != 0 && arr[i] >= arr[i - 1])) {
                return false;
            }
        }

        return topPoint != 0;
    }

    public static void main(String[] args) {
        var mountainArray = new ValidMountainArray();
        var result = mountainArray.validMountainArray(new int[]{0, 2, 3, 4, 5, 2, 1, 0});
        System.out.println("result = " + result);
        assertTrue(result);
    }
}
