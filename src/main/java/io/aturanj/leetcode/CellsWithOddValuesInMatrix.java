package io.aturanj.leetcode;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/
 */
public class CellsWithOddValuesInMatrix {

    public int oddCells(int m, int n, int[][] indices) {

        var array = new int[m][n];

        for (var item : indices) {
            for (var i = 0; i < n; i++) {
                array[item[0]][i] += 1;
            }
            for (var j = 0; j < m; j++) {
                array[j][item[1]] += 1;
            }
        }

        System.out.println(Arrays.deepToString(array));

        var counter = 0;
        for (var item : array) {
            for (var element : item) {
                if (element % 2 != 0) {
                    counter++;
                }
            }
        }

        return counter;
    }

    public static void main(String[] args) {
        CellsWithOddValuesInMatrix oddValuesInMatrix = new CellsWithOddValuesInMatrix();
        var result = oddValuesInMatrix.oddCells(2, 3, new int[][]{{0, 1}, {1, 1}});
        System.out.println("result = " + result);
    }
}
