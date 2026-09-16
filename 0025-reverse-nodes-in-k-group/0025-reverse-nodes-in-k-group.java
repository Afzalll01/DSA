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
    public ArrayList<Integer> reverse(ArrayList<Integer> list,int i,int j){
        while(i<j){
            int temp=list.get(i);
            list.set(i,list.get(j));
            list.set(j,temp);
            i++;
            j--;
        }
        return list;
    }
    public ArrayList<Integer> reverseK(ArrayList<Integer> list,int i,int k){
        if(i>=list.size()) return list;
        int j=i+k-1;
        if (j >= list.size()) {
            return list;
        }
        list=reverse(list,i,j);
        return reverseK(list,j+1,k);
    }
    
    public ListNode reverseKGroup(ListNode head, int k) {
        ArrayList<Integer> List=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            List.add(temp.val);
            temp=temp.next;
        }
        List=reverseK(List,0,k);
        ListNode dummy=new ListNode(-1);
        ListNode t=dummy;
        for(int i=0;i<List.size();i++){
            ListNode p=new ListNode(List.get(i));
            t.next=p;
            t=t.next;
        }
        t.next=null;
        return dummy.next;
    }
}