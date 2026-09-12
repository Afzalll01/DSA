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
    public void reorderList(ListNode head) {
        ArrayList<ListNode> arr=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            arr.add(temp);
            temp=temp.next;
        }
        ArrayList<ListNode> ar=new ArrayList<>();
        int i=0;
        int j=arr.size()-1;
        while(arr.size()-ar.size()>0){
            ar.add(arr.get(i));
            i++;
            ar.add(arr.get(j));
            j--;
        }
        ListNode dummy=new ListNode(-1);
        ListNode t=dummy;
        for(ListNode k:ar){
            t.next=k;
            t=t.next;
        }
        t.next=null;
    }
}