package io.aturanj.leetcode;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * https://leetcode.com/problems/linked-list-components/
 */
public class LinkedListComponents {

    public int numComponents(ListNode head, int[] nums) {

        var list = Arrays.stream(nums).boxed().collect(Collectors.toList());
        var currentNode = head;
        var counter = 0;

        while (currentNode != null) {
            if (list.contains(currentNode.val)) {
                counter++;

                while (currentNode.next != null && list.contains(currentNode.next.val)) {
                    currentNode = currentNode.next;
                }
            }
            currentNode = currentNode.next;
        }

        return counter;
    }

    /**
     * Definition for singly-linked list.
     */
    public class ListNode {

        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
