/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode curr =headA;
        ListNode curr1=headB;
        while(curr!=curr1){
            curr = curr==null?headB:curr.next;
            curr1 = curr1==null?headA:curr1.next;
        }
        return curr;
    }
}