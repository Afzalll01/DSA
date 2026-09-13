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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy=new ListNode(-1);
        ListNode t=dummy;
        int carry=0;
        ArrayList<Integer> arr=new ArrayList<>();
        while(l1!=null && l2!=null){
            int x=l1.val+l2.val+carry;
            arr.add(x%10);
            carry=x/10;
            l1=l1.next;
            l2=l2.next;
        }
        while(l1!=null){
            int x=l1.val+carry;
            arr.add(x%10);
            carry=x/10;
            l1=l1.next;
        }
        while(l2!=null){
            int x=l2.val+carry;
            arr.add(x%10);
            carry=x/10;
            l2=l2.next;
        }
        if(l1==null && l2==null && carry!=0){
            arr.add(carry);
        }
        for(int i=0;i<arr.size();i++){
            t.next=new ListNode(arr.get(i));
            t=t.next;
        }
        return dummy.next;
    }
}