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
        ListNode dummy=head;
        int size=1;
        if(head==null) return null;
        while(temp.next!=null){
            size++;
            temp=temp.next;
        }
        k=k%size;
        if (k == 0) {
            return head;
        }
        temp.next=head;
        for(int i=1;i<size-k;i++){
            dummy=dummy.next;
        }
        ListNode newHead=dummy.next;
        dummy.next=null;
        return newHead;
        
    }
}