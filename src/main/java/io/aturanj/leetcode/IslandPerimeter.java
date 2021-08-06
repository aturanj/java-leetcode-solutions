package io.aturanj.leetcode;

/**
 * https://leetcode.com/problems/island-perimeter/
 */
public class IslandPerimeter {

    public int islandPerimeter(int[][] grid) {

        var row = grid.length;
        var col = grid[0].length;
        var perimeterSum = 0;

        for (var i = 0; i < row; i++) {
            for (var j = 0; j < col; j++) {

                if (grid[i][j] == 1) {

                    perimeterSum += 4;

                    if (i - 1 >= 0 && grid[i - 1][j] == 1) {
                        perimeterSum -= 1;
                    }

                    if (j + 1 < col && grid[i][j + 1] == 1) {
                        perimeterSum -= 1;
                    }

                    if (i + 1 < row && grid[i + 1][j] == 1) {
                        perimeterSum -= 1;
                    }

                    if (j - 1 >= 0 && grid[i][j - 1] == 1) {
                        perimeterSum -= 1;
                    }
                }
            }
        }

        return perimeterSum;
    }

    public static void main(String[] args) {
        var island = new IslandPerimeter();
        var result = island.islandPerimeter(new int[][]{
            {0, 1, 0, 0},
            {1, 1, 1, 0},
            {0, 1, 0, 0},
            {1, 1, 0, 0}
        });
        System.out.println("result = " + result);
    }
}
