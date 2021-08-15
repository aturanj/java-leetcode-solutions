package io.aturanj.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.com/problems/find-a-peak-element-ii/
 */
public class FindAPeakElementII {

    public int[] findPeakGrid(int[][] mat) {

        List<Integer> list = new ArrayList<>();
        var row = mat.length;
        var col = mat[0].length;

        block:
        {
            for (var i = 0; i < row; i++) {
                for (var j = 0; j < col; j++) {

                    var check = true;

                    if (i + 1 < row && mat[i][j] < mat[i + 1][j]) {
                        check = false;
                    }

                    if (i - 1 >= 0 && mat[i][j] < mat[i - 1][j]) {
                        check = false;
                    }

                    if (j + 1 < col && mat[i][j] < mat[i][j + 1]) {
                        check = false;
                    }

                    if (j - 1 >= 0 && mat[i][j] < mat[i][j - 1]) {
                        check = false;
                    }

                    if (check) {
                        list.add(i);
                        list.add(j);
                        break block;
                    }
                }
            }
        }

        return list.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        var find = new FindAPeakElementII();
        var result = find.findPeakGrid(
                new int[][]{
                    {10, 20, 15},
                    {21, 30, 14},
                    {7, 16, 32}}
        );
        System.out.println("result = " + Arrays.toString(result));
    }
}
