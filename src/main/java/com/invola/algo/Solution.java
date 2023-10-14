package com.invola.algo;

/**
 * 
 * Given the head of a singly linked list,
 * return the middle node of the linked list.
 * If there are two middle nodes, return the second middle node.
 * The number of nodes in the list is in the range [1, 100].
 */

public class Solution {
    private final class ListNode {
        int value;
        ListNode next;
    }

    /**
     * find middle node method
     * Time: O(n)
     * Space: O(1)
     * 
     * @param head
     * @return middleNode
     */
    public ListNode findMiddleNode(ListNode head) {
        ListNode slow = head, fast = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }
}
