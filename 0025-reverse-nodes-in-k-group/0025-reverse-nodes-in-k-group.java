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
    public ListNode reverse(ListNode start,ListNode end){
        ListNode curr=start;
        ListNode prev=null;
        ListNode fwd=null;
        while(curr!=end){
            fwd=curr.next;
            curr.next=prev;
            prev=curr;
            curr=fwd;
        }
        return prev;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null || k==1) return head;
        ListNode temp=head;
        for(int i=0;i<k;i++){
            if(temp==null) return head;
            temp=temp.next;
        }
        ListNode nextGroup=temp;
        ListNode newHead=reverse(head,nextGroup);
        head.next=reverseKGroup(nextGroup,k);
        return newHead;
    }
}