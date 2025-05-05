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
    public ListNode removeElements(ListNode head, int val) {
        ListNode temp = new ListNode(0);
        ListNode c = temp;
        temp.next = head;
        while(c.next != null ){
            if(c.next.val == val) {
                c.next = c.next.next;
            }
            else {
                c = c.next;
            }
        }
        return temp.next;
    }
}