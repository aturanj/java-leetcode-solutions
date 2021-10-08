package io.aturanj.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
 */
public class NumberOfStepsToReduceNumberToZero {

    public int numberOfSteps(int num) {

        if (num == 0) {
            return 0;
        }

        var sum = 0;

        while (num > 0) {
            if (num % 2 == 1) {
                num -= 1;
            } else {
                num /= 2;
            }
            sum++;
        }

        return sum;
    }

    public static void main(String[] args) {
        var reduceNumberToZero = new NumberOfStepsToReduceNumberToZero();
        var result = reduceNumberToZero.numberOfSteps(14);
        System.out.println("result = " + result);
        assertEquals(result, 6);
    }
}
