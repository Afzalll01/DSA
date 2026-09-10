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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode i=head;
        ListNode j=head;
        if(head==null) return null;
        while(j!=null){
            if(i.val==j.val) j=j.next;
            else{
                i.next=j;
                i=j;
            }
        }
        i.next=j;
        return head;
    }
}