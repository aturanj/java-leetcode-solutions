package io.aturanj.leetcode;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.IntStream;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * https://leetcode.com/problems/ugly-number/
 */
public class UglyNumber {

    private final Map<Integer, Boolean> memoizationMap = new ConcurrentHashMap<>();

    public boolean isUgly(int n) {

        if (n <= 0) {
            return false;
        }

        var result = IntStream.
                range(2, n + 1)
                .parallel()
                .anyMatch(i -> n % i == 0 && i > 5 && isPrime(i));

        return !result;
    }

    private boolean isPrime(int number) {

        if (memoizationMap.containsKey(number)) {
            return memoizationMap.get(number);
        }

        if (number <= 1) {
            return false;
        }

        for (int i = 2; i < number; i++) {

            if (number % i == 0) {
                memoizationMap.put(number, false);
                return false;
            }
        }

        memoizationMap.put(number, true);
        return true;
    }

    public static void main(String[] args) {
        var uglyNumber = new UglyNumber();
        var result = uglyNumber.isUgly(6);
        System.out.println("result = " + result);
        assertTrue(result);
    }
}
