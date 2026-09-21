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
    public ListNode reverse(ListNode head){
        ListNode curr=head;
        ListNode pwd=null;
        ListNode prev=null;
        while(curr!=null){
            pwd=curr.next;
            curr.next=prev;
            prev=curr;
            curr=pwd;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode head2 = slow.next;
        slow.next = null;

        head2 = reverse(head2);

        ListNode c1 = head;
        ListNode c2 = head2;

        while(c1!=null && c2!=null){
            if(c1.val!=c2.val) return false;
            c1=c1.next;
            c2=c2.next;
        }
        return true;
    }
}