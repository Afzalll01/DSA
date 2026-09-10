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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode temp=head;
        int size=0;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        temp=head;
        for(int i=1;i<k;i++){
            temp=temp.next;
        }
        int f=temp.val;
        temp=head;
        for(int i=1;i<size-k+1;i++){
            temp=temp.next;
        }
        int s=temp.val;
        temp=head;
        for(int i=1;i<k;i++){
            temp=temp.next;
        }
        temp.val=s;
        temp=head;
        for(int i=1;i<size-k+1;i++){
            temp=temp.next;
        }
        temp.val=f;
        return head;

    }
}