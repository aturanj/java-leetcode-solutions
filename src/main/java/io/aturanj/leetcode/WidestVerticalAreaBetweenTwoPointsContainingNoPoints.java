package io.aturanj.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * https://leetcode.com/problems/widest-vertical-area-between-two-points-containing-no-points/
 */
public class WidestVerticalAreaBetweenTwoPointsContainingNoPoints {

    public int maxWidthOfVerticalArea(int[][] points) {

        List<Integer> list = new ArrayList<>();

        for (var item : points) {
            list.add(item[0]);//x-axis
        }

        Collections.sort(list);

        var maxWith = 0;
        for (int i = 1; i < list.size(); i++) {
            maxWith = Math.max(maxWith, list.get(i) - list.get(i - 1));
        }

        return maxWith;
    }

    public static void main(String[] args) {
        WidestVerticalAreaBetweenTwoPointsContainingNoPoints points
                = new WidestVerticalAreaBetweenTwoPointsContainingNoPoints();
        var result = points.maxWidthOfVerticalArea(
                new int[][]{{3, 1}, {9, 0}, {1, 0}, {1, 4}, {5, 3}, {8, 8}}
        );
        System.out.println("result = " + result);
    }
}
