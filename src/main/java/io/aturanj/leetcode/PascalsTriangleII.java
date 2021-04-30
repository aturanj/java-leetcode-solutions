package io.aturanj.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.com/problems/pascals-triangle-ii/
 */
public class PascalsTriangleII {

    public List<Integer> getRow(int rowIndex) {

        int[][] cache = new int[rowIndex][rowIndex];

        if (rowIndex == 0) {
            return Arrays.asList(1);
        }

        List<Integer> list = new ArrayList<>();

        int index = rowIndex;

        list.add(1);

        for (int i = 1; i < index; i++) {
            list.add(calculate(rowIndex, i, cache));
        }

        list.add(1);

        return list;
    }

    private int calculate(int row, int column, int[][] cache) {

        if (row == 1) {
            return 1;
        }

        if (column <= 0 || column >= row) {
            return 1;
        }

        int sum1, sum2;

        if (cache[row - 1][column - 1] == 0) {
            sum1 = calculate(row - 1, column - 1, cache);
            cache[row - 1][column - 1] = sum1;
        } else {
            sum1 = cache[row - 1][column - 1];
        }

        if (cache[row - 1][column] == 0) {
            sum2 = calculate(row - 1, column, cache);
            cache[row - 1][column] = sum2;
        } else {
            sum2 = cache[row - 1][column];
        }

        return sum1 + sum2;
    }

    public static void main(String[] args) {

        PascalsTriangleII pascalsTriangleII = new PascalsTriangleII();
        var result = pascalsTriangleII.getRow(5);

        result.forEach(x -> {
            System.out.print(" " + x);
        });
    }
}
