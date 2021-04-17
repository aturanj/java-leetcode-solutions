package io.aturanj.leetcode;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/reducing-dishes/
 */
public class ReducingDishes {

    public int maxSatisfaction(int[] satisfaction) {

        Arrays.sort(satisfaction);

        int sum = 0;
        int maxSum = 0;
        int length = satisfaction.length;

        for (int j = 0; j < length; j++) {

            for (int i = 1; i <= satisfaction.length; i++) {
                sum += satisfaction[i - 1] * i;
            }

            if (maxSum < sum) {
                maxSum = sum;
            }

            sum = 0;

            satisfaction = Arrays.copyOfRange(satisfaction, 1, satisfaction.length);

            System.out.println(Arrays.toString(satisfaction));
        }

        return maxSum;
    }

    public static void main(String[] args) {

        ReducingDishes reducingDishes = new ReducingDishes();
        var result = reducingDishes.maxSatisfaction(new int[]{-2, 5, -1, 0, 3, -3});

        System.out.println("result = " + result);
    }
}
