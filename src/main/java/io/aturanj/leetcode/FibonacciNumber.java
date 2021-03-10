package io.aturanj.leetcode;

/**
 * https://leetcode.com/problems/fibonacci-number/
 */
public class FibonacciNumber {

    public int fib(int n) {

        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {

        FibonacciNumber fibonacciNumber = new FibonacciNumber();
        var result = fibonacciNumber.fib(22);

        System.out.println("result = " + result);
    }
}
