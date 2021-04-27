package io.aturanj.leetcode;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/rotate-image/
 */
public class RotateImage {

    public void rotate(int[][] matrix) {

        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = i; j < matrix[0].length; j++) {

                var temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        var n = matrix[0].length;

        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n / 2; k++) {
                var temp = matrix[i][k];
                matrix[i][k] = matrix[i][n - k - 1];
                matrix[i][n - k - 1] = temp;
            }

            System.out.println(Arrays.toString(matrix[i]));
        }
    }

    public static void main(String[] args) {

        RotateImage rotateImage = new RotateImage();
        rotateImage.rotate(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
    }
}
