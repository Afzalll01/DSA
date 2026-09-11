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
    public ListNode sortList(ListNode head) {
        if(head==null) return null;
        if(head.next==null) return head;
        ListNode i=head;
        ListNode j=head;
        while(j.next!=null && j.next.next!=null){
            i=i.next;
            j=j.next.next;
        }
        ListNode k=i.next;
        i.next=null;
        head=sortList(head);
        k=sortList(k);
        return mergeSortList(head,k);

    }
    public ListNode mergeSortList(ListNode head1,ListNode head2){
        ListNode i=head1;
        ListNode j=head2;
        ListNode dummy=new ListNode(-1);
        ListNode k=dummy;
        while(i!=null && j!=null){
            if(i.val<=j.val){
                k.next=i;
                k=k.next;
                i=i.next;
            }else{
                k.next=j;
                k=k.next;
                j=j.next;
            }
        }
        if(i!=null){
            k.next=i;
        }else{
            k.next=j;
        }
        return dummy.next;
    }
}