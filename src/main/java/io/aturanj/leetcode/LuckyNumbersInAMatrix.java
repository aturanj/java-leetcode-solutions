package io.aturanj.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/lucky-numbers-in-a-matrix/
 */
public class LuckyNumbersInAMatrix {

    public List<Integer> luckyNumbers(int[][] matrix) {

        var row = matrix.length;
        var col = matrix[0].length;
        var list = new ArrayList<Integer>();

        for (var i = 0; i < row; i++) {
            for (var j = 0; j < col; j++) {
                if (isLuckyNumber(matrix, i, j, col, row)) {
                    list.add(matrix[i][j]);
                }
            }
        }

        return list;
    }

    private boolean isLuckyNumber(int[][] matrix, int i, int j, int col, int row) {

        var minOfRow = Integer.MAX_VALUE;
        var maxOfCol = Integer.MIN_VALUE;
        var number = matrix[i][j];

        for (var k = 0; k < col; k++) {
            minOfRow = Math.min(matrix[i][k], minOfRow);
        }
        for (var k = 0; k < row; k++) {
            maxOfCol = Math.max(matrix[k][j], maxOfCol);
        }

        return number == minOfRow && number == maxOfCol;
    }

    public static void main(String[] args) {
        var luckyNumbersInAMatrix = new LuckyNumbersInAMatrix();
        var result = luckyNumbersInAMatrix.luckyNumbers(new int[][]{
            {1, 10, 4, 2},
            {9, 3, 8, 7},
            {15, 16, 17, 12}
        });
        result.forEach(x -> System.out.println(x));
    }
}
