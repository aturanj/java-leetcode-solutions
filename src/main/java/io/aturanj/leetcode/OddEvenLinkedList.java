package io.aturanj.leetcode;

import java.util.ArrayList;

/**
 * https://leetcode.com/problems/odd-even-linked-list/
 */
public class OddEvenLinkedList {

    public ListNode oddEvenList(ListNode head) {

        var listOdd = new ArrayList<ListNode>();
        var listEven = new ArrayList<ListNode>();
        var currentNode = head;
        var indice = 1;

        while (currentNode != null) {
            if (indice % 2 == 0) {
                listEven.add(currentNode);
                if (listEven.size() > 1) {
                    listEven.get(listEven.size() - 2).next = listEven.get(listEven.size() - 1);
                }
                System.out.println("Evens: " + currentNode.val);
            } else {
                listOdd.add(currentNode);
                if (listOdd.size() > 1) {
                    listOdd.get(listOdd.size() - 2).next = listOdd.get(listOdd.size() - 1);
                }
                System.out.println("Ods: " + currentNode.val);

            }
            currentNode = currentNode.next;
            indice++;
        }

        if (listOdd.size() > 0 && listEven.size() > 0) {
            listOdd.get(listOdd.size() - 1).next = listEven.get(0); //combine two list
        }
        if (listEven.size() > 0) {
            listEven.get(listEven.size() - 1).next = null; //the next of last node is null
        }
        return head;
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
