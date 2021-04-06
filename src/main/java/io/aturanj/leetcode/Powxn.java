package io.aturanj.leetcode;

/**
 * https://leetcode.com/problems/powx-n/
 */
public class Powxn {

    public double myPow(double x, int n) {

        return multiply(n, x);
    }

    private double multiply(int n, double x) {

        if (n == 0) {
            return 1; // base or bottom case
        }

        if (n < 0) {

            if (n % 2 == 0) {

                var y = multiply(n / 2, 1 / x);

                return 1 / (y * y);
            } else {
                n++;
                return (1 / x) * multiply(n, x);
            }
        } else {

            if (n % 2 == 0) {

                var y = multiply(n / 2, x);

                return y * y;
            } else {
                n--;
                return x * multiply(n, x);
            }
        }
    }

    public static void main(String[] args) {

        Powxn powxn = new Powxn();
        var result = powxn.myPow(2, -2);

        System.out.println("result = " + result);
    }
}
