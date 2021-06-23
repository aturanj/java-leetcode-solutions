package io.aturanj.leetcode;

import java.util.PriorityQueue;

/**
 * https://leetcode.com/problems/kth-largest-element-in-a-stream/
 */
public class KthLargestElementInStream {

    PriorityQueue<Integer> queue;
    int threshold = 0;

    public KthLargestElementInStream(int k, int[] nums) {

        threshold = k;

        queue = new PriorityQueue<>();

        for (var item : nums) {
            this.add(item);
        }
    }

    private int add(int val) {
        queue.add(val);
        if (queue.size() > threshold) {
            queue.poll();
        }
        return queue.peek();
    }

    public static void main(String[] args) {
        KthLargestElementInStream kthLargestElementInStream
                = new KthLargestElementInStream(3, new int[]{4, 5, 8, 2});

        System.out.println(kthLargestElementInStream.add(3));   // return 4
        System.out.println(kthLargestElementInStream.add(5));   // return 5
        System.out.println(kthLargestElementInStream.add(10));  // return 5
        System.out.println(kthLargestElementInStream.add(9));   // return 8
        System.out.println(kthLargestElementInStream.add(4));   // return 8
    }
}
