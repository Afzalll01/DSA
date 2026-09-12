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
    public ListNode reverseList(ListNode head) {
        ListNode temp=head;
        ArrayList<ListNode> arr=new ArrayList<>();
        while(temp!=null){
            arr.add(temp);
            temp=temp.next;
        }
        int size=arr.size();
        ListNode dum=new ListNode(-1);
        ListNode t=dum;
        for(int i=size-1;i>=0;i--){
            t.next=arr.get(i);
            t=t.next;
        }
        t.next=null;
        return dum.next;
    }
}