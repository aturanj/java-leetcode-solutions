package io.aturanj.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.com/problems/pascals-triangle/
 */
public class PascalsTriangle {

    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> list = new ArrayList<>();

        if (numRows == 0) {
            return list;
        }

        list.add(Arrays.asList(1));

        if (numRows == 1) {
            return list;
        }

        list.add(Arrays.asList(1, 1));

        for (int i = 2; i < numRows; i++) {

            List<Integer> currentRow = new ArrayList<>();

            var prevRow = list.get(i - 1);

            for (int j = 0; j < i; j++) {

                if (j == 0 || j == i - 1) {
                    currentRow.add(1);
                }

                if ((j + 1) < prevRow.size()) {
                    currentRow.add(prevRow.get(j) + prevRow.get(j + 1));
                }
            }

            list.add(currentRow);
        }

        return list;
    }

    public static void main(String[] args) {

        PascalsTriangle pascalsTriangle = new PascalsTriangle();
        var result = pascalsTriangle.generate(5);

        result.forEach(System.out::println);
    }
}
