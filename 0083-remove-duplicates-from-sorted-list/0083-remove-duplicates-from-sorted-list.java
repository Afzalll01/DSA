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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy=head;
        ListNode temp=head;
        if(head==null || head.next==null) return head;
        while(temp!=null){
            if(temp.val!=dummy.val){
                dummy.next=temp;
                dummy=temp;
            }else{
                temp=temp.next;
            }
        }
        dummy.next=null;
        return head;
    }
}