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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode temp1=list1;
        ListNode temp2=list2;
        while(temp2.next!=null){
            temp2=temp2.next;
        }

        for(int i=1;i<a;i++){
            temp1=temp1.next;
        }
        ListNode s=temp1;
        for(int i=1;i<=b-a+1;i++){
            temp1=temp1.next;
        }
        ListNode end=temp1;
        ListNode t=list2;
        s.next=t;
        temp2.next=end.next;
        return list1;
        
        

    }
}