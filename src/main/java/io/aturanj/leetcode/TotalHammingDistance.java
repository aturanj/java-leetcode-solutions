package io.aturanj.leetcode;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

/**
 * https://leetcode.com/problems/total-hamming-distance/
 */
public class TotalHammingDistance {

    private AtomicInteger sum = new AtomicInteger();

    public int totalHammingDistance(int[] nums) {

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        try {

            Future<Integer> future = executorService.submit(() -> {

                IntStream.range(0, nums.length)
                        .forEach(i -> {
                            for (var j = i + 1; j < nums.length; j++) {
                                sum.getAndAdd(calculateHammingDistance(nums[i], nums[j]));
                            }
                        });

                return sum.get();

            });

            future.get();

        } catch (InterruptedException | ExecutionException ex) {
            System.out.println(ex);
        }

        executorService.shutdown();
        return sum.get();
    }

    private int calculateHammingDistance(int a, int b) {

        var aText = String.format("%32s", Integer.toBinaryString(a))
                .replace(" ", "0");
        var bText = String.format("%32s", Integer.toBinaryString(b))
                .replace(" ", "0");

        return (int) IntStream.range(0, 32)
                .filter(i -> aText.charAt(i) != bText.charAt(i))
                .count();
    }

    public static void main(String[] args) {
        var totalHammingDistance = new TotalHammingDistance();
        var result = totalHammingDistance.totalHammingDistance(new int[]{4, 14, 2});
        System.out.println("result = " + result);
    }
}
