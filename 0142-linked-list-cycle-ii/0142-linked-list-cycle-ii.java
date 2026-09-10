/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode f=head;
        ListNode s=head;
        while(s!=null && s.next!=null){
            f=f.next;
            s=s.next.next;
            if(f==s){
                ListNode b=head;
                while(b!=f){
                    f=f.next;
                    b=b.next;
                }
                return b;
            }
        }
        return null;
    }
}