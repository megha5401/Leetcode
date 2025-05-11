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
    //megha0
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode c = head;
        while (c != null && c.next != null) {
            int gcdValue = gcd(c.val, c.next.val);
            ListNode newNode = new ListNode(gcdValue);
            newNode.next = c.next; // Inserting the new node
            c.next = newNode;
            c = newNode.next;
        }
        return head;
    }
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}