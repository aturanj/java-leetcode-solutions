package io.aturanj.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://leetcode.com/problems/add-two-integers/
 */
public class AddTwoIntegers {

    public int sum(int num1, int num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        var addTwoIntegers = new AddTwoIntegers();
        var result = addTwoIntegers.sum(-10, 4);
        System.out.println("result = " + result);
        assertEquals(-6, result);
    }
}
