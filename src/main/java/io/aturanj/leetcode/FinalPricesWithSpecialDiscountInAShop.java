package io.aturanj.leetcode;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/final-prices-with-a-special-discount-in-a-shop/
 */
public class FinalPricesWithSpecialDiscountInAShop {

    public int[] finalPrices(int[] prices) {

        var result = new int[prices.length];

        for (var i = 0; i < result.length; i++) {
            result[i] = Integer.MAX_VALUE;
        }

        for (var i = 0; i < prices.length; i++) {
            for (var j = i + 1; j < prices.length; j++) {
                if (prices[j] <= prices[i]) {
                    result[i] = prices[i] - prices[j];
                    break;
                }
            }

            //no discount
            if (result[i] == Integer.MAX_VALUE) {
                result[i] = prices[i];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        var finalPrice = new FinalPricesWithSpecialDiscountInAShop();
        var result = finalPrice.finalPrices(new int[]{8, 4, 6, 2, 3});
        System.out.println("result = " + Arrays.toString(result));
    }
}
