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
    public ListNode insertionSortList(ListNode head) {
        ListNode dummy=new ListNode(Integer.MIN_VALUE);
        ListNode temp=head;
        while(temp!=null){
            ListNode curr=dummy;
            ListNode next=temp.next;
            while(curr.next!=null && curr.next.val<=temp.val){
                curr=curr.next;
            }
            temp.next=curr.next;
            curr.next=temp;
            temp=next;
        }
        return dummy.next;
    }
}