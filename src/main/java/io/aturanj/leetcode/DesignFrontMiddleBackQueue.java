package io.aturanj.leetcode;

import java.util.LinkedList;

/**
 * https://leetcode.com/problems/design-front-middle-back-queue/
 */
public class DesignFrontMiddleBackQueue {

    LinkedList<Integer> queue;

    public DesignFrontMiddleBackQueue() {
        queue = new LinkedList<>();
    }

    public void pushFront(int val) {
        queue.addFirst(val);
    }

    public void pushMiddle(int val) {
        queue.add(queue.size() / 2, val);
    }

    public void pushBack(int val) {
        queue.addLast(val);
    }

    public int popFront() {
        return !queue.isEmpty() ? queue.removeFirst() : -1;
    }

    public int popMiddle() {
        return !queue.isEmpty() ? queue.remove((queue.size() - 1) / 2) : -1;
    }

    public int popBack() {
        return !queue.isEmpty() ? queue.removeLast() : -1;
    }

    public static void main(String[] args) {

        DesignFrontMiddleBackQueue queue = new DesignFrontMiddleBackQueue();
        queue.pushFront(1);   // [1]
        queue.pushBack(2);    // [1, 2]
        queue.pushMiddle(3);  // [1, 3, 2]
        queue.pushMiddle(4);  // [1, 4, 3, 2]
        queue.popFront();     // return 1 -> [4, 3, 2]
        queue.popMiddle();    // return 3 -> [4, 2]
        queue.popMiddle();    // return 4 -> [2]
        queue.popBack();      // return 2 -> []
        queue.popFront();     // return -1 -> [] (The queue is empty)
    }
}
