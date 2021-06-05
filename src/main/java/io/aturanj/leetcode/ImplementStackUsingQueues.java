package io.aturanj.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/implement-stack-using-queues/
 */
public class ImplementStackUsingQueues {

    private List<Integer> queue;

    /**
     * Initialize your data structure here.
     */
    public ImplementStackUsingQueues() {
        queue = new ArrayList();
    }

    /**
     * Push element x onto stack.
     */
    public void push(int x) {
        queue.add(x);
    }

    /**
     * Removes the element on top of the stack and returns that element.
     */
    public int pop() {
        return queue.remove(queue.size() - 1);
    }

    /**
     * Get the top element.
     */
    public int top() {
        return queue.get(queue.size() - 1);
    }

    /**
     * Returns whether the stack is empty.
     */
    public boolean empty() {
        return queue.isEmpty();
    }

    public static void main(String[] args) {
        ImplementStackUsingQueues obj = new ImplementStackUsingQueues();
        obj.push(1);
        obj.push(2);

        int param_2 = obj.top();
        int param_3 = obj.pop();
        boolean param_4 = obj.empty();

        System.out.println("param_2 = " + param_2);
        System.out.println("param_3 = " + param_3);
        System.out.println("param_4 = " + param_4);
    }
}

// Your MyStack object will be instantiated and called as such:
// ImplementStackUsingQueues obj = new ImplementStackUsingQueues();
// obj.push(x);
// int param_2 = obj.pop();
// int param_3 = obj.top();
// boolean param_4 = obj.empty();

