package io.aturanj.leetcode;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://leetcode.com/problems/maximum-number-of-balls-in-a-box/
 */
public class MaximumNumberOfBallsInABox {

    public int countBalls(int lowLimit, int highLimit) {

        var map = new HashMap<Integer, Integer>();

        for (var i = lowLimit; i <= highLimit; i++) {

            var box = new AtomicInteger(0);

            ("" + i).chars().forEach(x -> box.addAndGet(Character.getNumericValue(x)));

            map.put(box.get(), map.getOrDefault(box.get(), 0) + 1);
        }

        var maxBall = new AtomicInteger(0);

        map.entrySet().forEach(x -> {
            if (maxBall.get() < x.getValue()) {
                maxBall.set(x.getValue());
            }
        });

        return maxBall.get();
    }

    public static void main(String[] args) {
        var maximumNumberOfBalls = new MaximumNumberOfBallsInABox();
        var result = maximumNumberOfBalls.countBalls(1, 10);
        System.out.println("result = " + result);
        assertEquals(2, result);
    }
}
