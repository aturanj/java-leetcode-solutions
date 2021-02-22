package io.aturanj.leetcode;

/**
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 */
public class BestTimeToBuyAndSellStock {

    public int maxProfit(int[] prices) {

        int profit = 0;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < prices.length; i++) {

            if (prices[i] < min) {

                min = prices[i];

            }

            profit = Math.max(profit, prices[i] - min);
        }

        return profit;
    }

    public static void main(String[] args) {

        BestTimeToBuyAndSellStock bestTimeToBuyAndSellStock = new BestTimeToBuyAndSellStock();
        var result = bestTimeToBuyAndSellStock.maxProfit(new int[]{7, 1, 5, 3, 6, 4});

        System.out.println("bestTimeToBuyAndSellStock = " + result);
    }
}
