package io.aturanj.leetcode;

/**
 * https://leetcode.com/problems/climbing-stairs/
 */
public class ClimbingStairs {

    public int climbStairs(int n) {

        int[] memo = new int[n + 1];

        int i = 0;

        var result = climb(i, n, memo);

        return result;
    }

    private int climb(int i, int n, int[] memo) {

        if (i > n) {
            return 0;
        }

        if (i == n) {
            return 1;
        }

        if (memo[i] > 0) {
            return memo[i];
        }

        memo[i] = climb(i + 1, n, memo) + climb(i + 2, n, memo);

        return memo[i];
    }

    public static void main(String[] args) {
        ClimbingStairs climbingStairs = new ClimbingStairs();
        System.out.println("climbingStairs = " + climbingStairs.climbStairs(111));
    }

    /**
     * Alternative solution
     */
    public int climbStairsAlternative(int n) {

        int dp[] = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }
}
