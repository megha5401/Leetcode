/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) return head;
        // Counting the length and get the tail
        ListNode tail = head;
        int l = 1; //length
        while (tail.next != null) {
            tail = tail.next;
            l++;
        }
        tail.next = head; // Making it a circular list
        k = k % l; // Normalize k
        int steps = l - k;
        ListNode newTail = tail;
        for (int i = 0; i < steps; i++) {
            newTail = newTail.next;
        }
        ListNode newHead = newTail.next;
        newTail.next = null;
        return newHead;
    }
}