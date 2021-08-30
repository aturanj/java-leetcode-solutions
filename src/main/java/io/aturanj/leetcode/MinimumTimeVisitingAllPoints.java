package io.aturanj.leetcode;

/**
 * https://leetcode.com/problems/minimum-time-visiting-all-points/
 */
public class MinimumTimeVisitingAllPoints {

    public int minTimeToVisitAllPoints(int[][] points) {

        var time = 1; //sec
        var sum = 0;

        for (int i = 1; i <= points.length - 1; i++) {

            var xDistance = Math.abs(points[i][0] - points[i - 1][0]);
            var yDistance = Math.abs(points[i][1] - points[i - 1][1]);
            var diagonalDistance = Math.min(xDistance, yDistance);
            var straightDistance = Math.max(xDistance, yDistance) - diagonalDistance;

            sum += diagonalDistance * time + straightDistance * time;
        }

        return sum;
    }

    public static void main(String[] args) {
        var minTime = new MinimumTimeVisitingAllPoints();
        var result = minTime.minTimeToVisitAllPoints(
                new int[][]{{1, 1}, {3, 4}, {-1, 0}}
        );
        System.out.println("result = " + result);
    }
}
