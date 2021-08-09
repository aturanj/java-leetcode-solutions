package io.aturanj.leetcode;

import java.util.HashMap;

/**
 * https://leetcode.com/problems/matrix-diagonal-sum/
 */
public class MatrixDiagonalSum {

    public int diagonalSum(int[][] mat) {

        var map = new HashMap<String, Integer>();

        //primary diagonal
        for (var i = 0; i < mat.length; i++) {
            map.put(i + "-" + i, mat[i][i]);
        }

        //secondary diagonal
        for (var i = 0; i < mat.length; i++) {
            var x = mat.length - i - 1;
            map.put(x + "-" + i, mat[x][i]);
        }

        return map.values().stream().mapToInt(x -> x).sum();
    }

    public static void main(String[] args) {
        var matrix = new MatrixDiagonalSum();
        var result = matrix.diagonalSum(new int[][]{
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        });
        System.out.println("result = " + result);
    }
}
