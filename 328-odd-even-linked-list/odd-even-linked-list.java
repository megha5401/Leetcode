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
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even; // Save the head of the even list
        while (even != null && even.next != null) {
            odd.next = even.next; // Link to the next odd node
            odd = odd.next;       // Move odd pointer
            even.next = odd.next; // Link to the next even node
            even = even.next;     // Move even pointer
        }
        odd.next = evenHead; // Join even list at the end of odd list
        return head;  
    }
}