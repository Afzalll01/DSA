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
        if (head == null || head.next == null) {
            return head;
        }
        ListNode temp=head;
        int size=0;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        temp=head;
        int n=k%size;
        if(n==0) return head;
        int idx=size-n;
        for(int i=1;i<idx;i++){
            temp=temp.next;
        }
        ListNode ans=temp.next;
        temp.next=null;
        ListNode last=ans;
        while(last.next!=null){
            last=last.next;
        }
        last.next=head;
        return ans;
    }

}