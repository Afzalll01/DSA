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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] arr=new ListNode[k];
        ListNode temp=head;
        int size=0;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        temp=head;
        if(k>size){
            for(int i=0;i<k;i++){
                arr[i]=temp;
                if(temp!=null){
                    temp=temp.next;
                    arr[i].next=null;
                }
            }
        }
        else{
            int how=size/k;
            int extra=size%k;

            for(int i=0;i<k;i++){
                arr[i]=temp;
                int count=how;
                if(extra>0){
                    count++;
                    extra--;
                }
                for(int j=1;j<count;j++){
                    temp=temp.next;
                }
                if(temp!=null) {
                    ListNode next = temp.next;
                    temp.next = null;
                    temp = next;
                }
            }
        }
        return arr;
    }
}