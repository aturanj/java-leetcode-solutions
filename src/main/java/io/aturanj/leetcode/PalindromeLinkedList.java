package io.aturanj.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/palindrome-linked-list/
 */
public class PalindromeLinkedList {

    public boolean isPalindrome(ListNode head) {

        if (head == null) {
            return true;
        }

        List<Integer> list = new ArrayList<>();

        ListNode currentNode = head;

        list.add(currentNode.val);

        while (currentNode.next != null) {

            currentNode = currentNode.next;

            list.add(currentNode.val);
        }

        if (list.size() == 1) {
            return true;
        }

        for (int i = 0, j = list.size() - 1; i < list.size() / 2; i++, j--) {

            if (Integer.compare(list.get(i), list.get(j)) != 0) {
                return false;
            }
        }

        return true;
    }

    /**
     * Definition for singly-linked list
     */
    class ListNode {

        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
