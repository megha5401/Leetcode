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
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        List<Integer> value = new ArrayList<>();
        ListNode c = head; //current
        while(c != null) {
            value.add(c.val);
            c = c.next;
        }
        int l = 0, r = value.size() - 1;
        while (l < r) {
            if (!value.get(l).equals(value.get(r))){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}