package io.aturanj.leetcode;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/count-primes/
 */
public class CountPrimes {

    public int countPrimes(int n) {

        int[] primeArray = new int[n]; //all elements are 0/false

        for (int i = 2; i * i < primeArray.length; i++) {

            if (primeArray[i] == 0) {

                for (int j = i; i * j < primeArray.length; j++) {
                    primeArray[i * j] = 1;  //non-prime number
                }
            }
        }

        var count = (int) Arrays.stream(primeArray).filter(x -> x == 0).count();

        return count >= 2 ? count - 2 : 0; // 0 and 1 are not prime
    }

    public static void main(String[] args) {

        CountPrimes countPrimes = new CountPrimes();
        var result = countPrimes.countPrimes(499979);

        System.out.println("result = " + result);
    }

    /**
     * Alternative approach, checking all numbers sequentially
     */
    private boolean isPrime(int number) {

        if (number <= 1) {
            return false;
        }

        for (int i = 2; i < number; i++) {

            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
