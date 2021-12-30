package io.aturanj.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://leetcode.com/problems/base-7/
 */
public class Base7 {

    public String convertToBase7(int num) {
        return Integer.toString(num, 7);
    }

    public static void main(String[] args) {
        var base7 = new Base7();
        var result = base7.convertToBase7(100);
        System.out.println("result = " + result);
        assertEquals("202", result);
    }
}
