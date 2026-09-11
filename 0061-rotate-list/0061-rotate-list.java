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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode temp=head;
        if (head == null || head.next == null) {
            return head;
        }
        int size=0;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        temp=head;
        k=k%size;
        if(k==0) return head;
        int idx=size-k;
        while(idx!=1){
            temp=temp.next;
            idx--;
        }
        ListNode last=temp.next;
        ListNode ans=last;
        temp.next=null;
        while(ans.next!=null){
            ans=ans.next;
        }
        ans.next=head;
        return last;
    }
}