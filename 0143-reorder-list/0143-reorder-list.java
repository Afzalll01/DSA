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
    public ListNode reverse(ListNode head){
        ListNode curr=head;
        ListNode fwd=null;
        ListNode prev=null;
        while(curr!=null){
            fwd=curr.next;
            curr.next=prev;
            prev=curr;
            curr=fwd;
        }
        return prev;
    }
    public void reorderList(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow =slow.next;
            fast=fast.next.next;
        }
        ListNode a=slow.next;
        a=reverse(a);
        slow.next=null;
        ListNode t1=head;
        ListNode t2=a;
        ListNode dummy=new ListNode(-1);
        ListNode tempo=dummy;
        while(t1!=null && t2!=null){
            tempo.next=t1;
            t1=t1.next;
            tempo=tempo.next;
            tempo.next=t2;
             t2=t2.next;
            tempo=tempo.next;
        }
        if(t1==null){
            tempo.next=t2;
        }else{
            tempo.next=t1;
        }
    }
}