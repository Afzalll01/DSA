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
    public ListNode oddEvenList(ListNode head) {
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
        t2.next=null;
        t1.next=d2.next;
        return d1.next;
    }
}