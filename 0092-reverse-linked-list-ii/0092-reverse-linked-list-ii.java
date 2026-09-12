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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ArrayList<ListNode> arr=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            arr.add(temp);
            temp=temp.next;
        }
        int k=left-1;
        int j=right-1;
        while(k<j){
            ListNode temp1=arr.get(k);
            arr.set(k,arr.get(j));
            arr.set(j,temp1);
            k++;
            j--;
        }
        ListNode t=new ListNode(-1);
        ListNode tt=t;
        for(int i=0;i<=arr.size()-1;i++){
            tt.next=arr.get(i);
            tt=tt.next;
        }
        tt.next=null;
        return t.next;
    }
}