class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode d1=new ListNode(-1);
        ListNode d2=new ListNode(-1);
        ListNode t1=d1;
        ListNode t2=d2;
        ListNode a=head;
        while(a!=null){
            if(a.val<x){
                t1.next=a;
                t1=t1.next;
                a=a.next;
            }else{
                t2.next=a;
                t2=t2.next;
                a=a.next;
            }
        }
        t2.next=null;
        t1.next=d2.next;
        return d1.next;


    }
}