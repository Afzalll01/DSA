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
    public ListNode reverseList(ListNode crr) {
        if(crr==null) return null;
        if(crr.next==null) return crr;
        ListNode prev=crr.next;
        crr.next=null;
        ListNode b=reverseList(prev);
        prev.next=crr;
        return b;
    }
}