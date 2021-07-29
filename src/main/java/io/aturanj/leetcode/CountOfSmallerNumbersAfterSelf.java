package io.aturanj.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * https://leetcode.com/problems/count-of-smaller-numbers-after-self/
 */
public class CountOfSmallerNumbersAfterSelf {

    volatile static Map<Integer, Integer> list;
    List<Thread> threads;

    public List<Integer> countSmaller(int[] nums) {

        list = new ConcurrentHashMap<>();
        threads = new ArrayList<>();

        for (var i = 0; i < nums.length; i++) {
            final int a = i;
            Thread t = new Thread(() -> {
                check(nums, a);
            });
            t.start();
            threads.add(t);
        }

        threads.forEach(thread -> {
            try {
                thread.join();
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
        });
        return List.copyOf(list.values());
    }

    private static void check(int[] nums, int i) {
        var counter = 0;
        int[] sortedArray = Arrays.copyOfRange(nums, i, nums.length);
        Arrays.sort(sortedArray);

        for (var j = 0; j < sortedArray.length; j++) {

            if (sortedArray[j] < nums[i]) {
                counter++;
            } else {
                break;
            }
        }

        list.put(i, counter);
    }

    public static void main(String[] args) {
        var count = new CountOfSmallerNumbersAfterSelf();
        var result = count.countSmaller(new int[]{5, 2, 6, 1});
        result.forEach(System.out::println);
    }
}
