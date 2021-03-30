package io.aturanj.leetcode;

/**
 * https://leetcode.com/problems/sqrtx/
 */
public class SqrtX {

    public int mySqrt(int x) {
        return (int) Math.floor((double) Math.sqrt(x));
    }

    public static void main(String[] args) {

        SqrtX sqrtX = new SqrtX();
        var result = sqrtX.mySqrt(8);

        System.out.println("result = " + result);
    }
}
