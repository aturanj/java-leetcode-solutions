package io.aturanj.leetcode;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * https://leetcode.com/problems/interval-list-intersections/
 */
public class IntervalListIntersections {

    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {

        var i = 0;
        var j = 0;
        var list = new ArrayList<int[]>();

        while (firstList.length > i && secondList.length > j) {

            System.out.println("i: " + i + " j: " + j);

            var start = Math.max(firstList[i][0], secondList[j][0]);
            var end = Math.min(firstList[i][1], secondList[j][1]);

            if (start <= end) {
                list.add(new int[]{start, end});
            }

            if (firstList[i][1] < secondList[j][1]) {
                i++;
            } else {
                j++;
            }
        }

        var array = new int[list.size()][];

        for (var k = 0; k < list.size(); k++) {
            array[k] = list.get(k);
        }

        return array;
    }

    public static void main(String[] args) {
        var intervalListIntersections = new IntervalListIntersections();
        var result = intervalListIntersections.intervalIntersection(
                new int[][]{{0, 2}, {5, 10}, {13, 23}, {24, 25}},
                new int[][]{{1, 5}, {8, 12}, {15, 24}, {25, 26}}
        );
        System.out.println("result = " + Arrays.deepToString(result));
    }
}
