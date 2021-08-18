package io.aturanj.leetcode;

import java.util.Arrays;
import java.util.HashMap;

/**
 * https://leetcode.com/problems/set-matrix-zeroes/
 */
public class SetMatrixZeroes {

    public void setZeroes(int[][] matrix) {

        var row = matrix.length;
        var col = matrix[0].length;
        var map = new HashMap<String, Integer>();

        for (var i = 0; i < row; i++) {
            for (var j = 0; j < col; j++) {
                if (matrix[i][j] == 0) {
                    map.put(i + "#" + j, 0);
                }
            }
        }

        for (var i = 0; i < row; i++) {
            for (var j = 0; j < col; j++) {
                if (map.get(i + "#" + j) != null) {
                    for (var k = 0; k < col; k++) {
                        matrix[i][k] = 0;
                    }
                    for (var k = 0; k < row; k++) {
                        matrix[k][j] = 0;
                    }
                }
            }
        }

        System.out.println("matrix = " + Arrays.deepToString(matrix));
    }

    public static void main(String[] args) {
        var setMatrixZeroes = new SetMatrixZeroes();
        setMatrixZeroes.setZeroes(new int[][]{
            {0, 1, 2, 0},
            {3, 4, 5, 2},
            {1, 3, 1, 5}
        });
    }
}
