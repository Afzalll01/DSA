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
        int f=0;
        int size=0;
        while(temp!=null){
            if(size==k-1) f=temp.val;
            size++;
            temp=temp.next;
        }
        temp=head;
        for(int i=1;i<size-k+1;i++){
            temp=temp.next;
        }
        int s=temp.val;
        temp=head;
        for(int i=1;i<=size;i++){
            if(i==k) temp.val=s;
            if(i==size-k+1) temp.val=f;
            temp=temp.next;
        }
        return head;

    }
}