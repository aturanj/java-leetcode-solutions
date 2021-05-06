package io.aturanj.leetcode;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/richest-customer-wealth/
 */
public class RichestCustomerWealth {

    public int maximumWealth(int[][] accounts) {

        int sum = 0;

        for (int[] arr : accounts) {

            var tempSum = Arrays.stream(arr).reduce(0, (a, b) -> a + b);

            if (sum < tempSum) {
                sum = tempSum;
            }
        }

        return sum;
    }

    public static void main(String[] args) {

        RichestCustomerWealth rcw = new RichestCustomerWealth();
        var result = rcw.maximumWealth(new int[][]{{2, 8, 7}, {7, 1, 3}, {1, 9, 5}});

        System.out.println("result = " + result);
    }
}
