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
        ListNode prev=null;
        ListNode fwd=null;
        while(curr!=null){
        fwd=curr.next;
        curr.next=prev;
        prev=curr;
        curr=fwd;
        }
        return prev;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        l1=reverse(l1);
        l2=reverse(l2);
        ArrayList<Integer> list=new ArrayList<>();
        ListNode temp1=l1;
        ListNode temp2=l2;
        int carry=0;
        while(temp1!=null && temp2!=null){
            int sum=temp1.val+temp2.val+carry;
            list.add(sum%10);
            carry=sum/10;
            temp1=temp1.next;
            temp2=temp2.next;
        }
        while(temp1!=null){
            int sum=temp1.val+carry;
            list.add(sum%10);
            carry=sum/10;
            temp1=temp1.next;
        }
        while(temp2!=null){
            int sum=temp2.val+carry;
            list.add(sum%10);
            carry=sum/10;
            temp2=temp2.next;
        }
        if(carry!=0 && temp1==null && temp2==null){
            list.add(carry);
        }
        ListNode dummy=new ListNode(-1);
        ListNode t=dummy;
        for(int i=0;i<list.size();i++){
            t.next=new ListNode(list.get(i));
            t=t.next;
        }
        t.next=null;
        return reverse(dummy.next);

    }
}