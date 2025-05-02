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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode a = new ListNode(0);
        ListNode c = a;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                c.next = list1;
                list1 = list1.next;
            } else {
                c.next = list2;
                list2 = list2.next;
            }
            c = c.next;
        }
        // Attaching the remaining nodes from the non-exhausted list
        if (list1 != null) c.next = list1;
        else c.next = list2;
        return a.next;  // Returning the head of the merged list
    }
}