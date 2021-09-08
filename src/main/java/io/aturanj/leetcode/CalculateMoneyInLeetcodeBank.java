package io.aturanj.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://leetcode.com/problems/calculate-money-in-leetcode-bank/
 */
public class CalculateMoneyInLeetcodeBank {

    public int totalMoney(int n) {

        var sum = 0;
        var mondayBase = 0;

        for (var i = 0; i < n; i++) {
            if (i % 7 == 0) {
                mondayBase++;
                sum += mondayBase;
            } else {
                sum += mondayBase + i % 7;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        var calculateMoney = new CalculateMoneyInLeetcodeBank();
        var result = calculateMoney.totalMoney(20);
        System.out.println("result = " + result);

        assertEquals(result, 96);
    }
}
