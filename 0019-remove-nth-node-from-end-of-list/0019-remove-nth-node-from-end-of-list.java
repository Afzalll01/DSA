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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size=0;
        ListNode temp=head;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        int idx=size-n+1;
        if(idx==1) return head.next;
        temp=head;
        for(int i=1;i<idx-1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        return head;
    }
}