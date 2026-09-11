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
    public ListNode swapPairs(ListNode head) {
        ListNode d1=new ListNode(-1);
        ListNode d2=new ListNode(-1);
        ListNode t1=d1;
        ListNode t2=d2;
        ListNode temp=head;
        int i=0;
        while(temp!=null){
            if(i%2==0){
                t1.next=temp;
                t1=t1.next;
            }else{
                t2.next=temp;
                t2=t2.next;
            }
            i++;
            temp=temp.next;
        }
        t1.next=null;
        t2.next=null;
        ListNode n1=d1.next;
        ListNode n2=d2.next;
        ListNode n3=new ListNode(-1);
        ListNode t=n3;
        i=0;
        while(n1!=null & n2!=null){
            if(i%2==0){
                t.next=n2;
                t=t.next;
                n2=n2.next;
            }else{
                t.next=n1;
                t=t.next;
                n1=n1.next;
            }
            i++;
        }
        if(n1!=null){
            t.next=n1;
        }else{
            t.next=n2;
        }
        return n3.next;
    }
}