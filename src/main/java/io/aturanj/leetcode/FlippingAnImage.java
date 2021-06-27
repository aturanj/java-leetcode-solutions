package io.aturanj.leetcode;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/flipping-an-image/
 */
public class FlippingAnImage {

    public int[][] flipAndInvertImage(int[][] image) {
        //flipping
        for (var row : image) {
            for (int i = 0, j = row.length - 1; i < row.length / 2; i++, j--) {
                var temp = row[i];
                row[i] = row[j];
                row[j] = temp;
            }
        }

        //reversing
        for (var row : image) {
            for (int i = 0; i < row.length; i++) {
                if (row[i] == 1) {
                    row[i] = 0;
                } else {
                    row[i] = 1;
                }
            }
        }

        return image;
    }

    public static void main(String[] args) {
        FlippingAnImage flippingAnImage = new FlippingAnImage();

        var before = new int[][]{{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
        System.out.println("before = " + Arrays.deepToString(before));

        var after = flippingAnImage.flipAndInvertImage(before);
        System.out.println("after = " + Arrays.deepToString(after));
    }
}
