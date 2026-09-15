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
    public ListNode removeElements(ListNode head, int val) {
        ListNode temp=head;
        ListNode dummy=new ListNode(-1);
        ListNode t=dummy;
        while(temp!=null){
            if(temp.val!=val){
                t.next=temp;
                t=t.next;
            }
            temp=temp.next;
        }
        t.next=null;
        return dummy.next;
    }
}