package io.aturanj.leetcode;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/queries-on-number-of-points-inside-a-circle/
 */
public class QueriesOnNumberOfPointsInsideACircle {

    public int[] countPoints(int[][] points, int[][] queries) {

        int length = queries.length;
        int[] result = new int[length];

        for (int i = 0; i < length; i++) {

            int counter = 0;
            int[] query = queries[i];

            for (int[] point : points) {
                if (checkPoint(point, query)) {
                    counter++;
                }
            }

            result[i] = counter;
        }

        return result;
    }

    private boolean checkPoint(int[] point, int[] query) {

        double distance = Math.sqrt(Math.pow(point[0] - query[0], 2)
                + Math.pow(point[1] - query[1], 2));

        int radius = query[2];

        return distance > radius ? false : true;
    }

    public static void main(String[] args) {

        QueriesOnNumberOfPointsInsideACircle pointsInsideACircle = new QueriesOnNumberOfPointsInsideACircle();

        var result = pointsInsideACircle.countPoints(
                new int[][]{{1, 1}, {2, 2}, {3, 3}, {4, 4}, {5, 5}},
                new int[][]{{1, 2, 2}, {2, 2, 2}, {4, 3, 2}, {4, 3, 3}});

        System.out.println("result = " + Arrays.toString(result));
    }
}
