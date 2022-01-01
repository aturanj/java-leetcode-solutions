package io.aturanj.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://leetcode.com/problems/two-furthest-houses-with-different-colors/
 */
public class TwoFurthestHousesWithDifferentColors {

    public int maxDistance(int[] colors) {

        var max = 0;
        var rightMost = colors[colors.length - 1];
        var leftMost = colors[0];

        //check by rightMost
        for (var i = 0; i < colors.length; i++) {
            if (colors[i] != rightMost && Math.abs(i - (colors.length - 1)) > max) {
                max = Math.abs(i - (colors.length - 1));
            }
        }

        //check by leftmost
        for (var i = colors.length - 1; i >= 0; i--) {
            // 0 is index of the leftmost element
            if (colors[i] != leftMost && Math.abs(i - 0) > max) {
                max = Math.abs(i - 0);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        var twoFurthestHouses = new TwoFurthestHousesWithDifferentColors();
        var result = twoFurthestHouses.maxDistance(new int[]{1, 1, 1, 6, 1, 1, 1});
        System.out.println("result = " + result);
        assertEquals(3, result);
    }
}
