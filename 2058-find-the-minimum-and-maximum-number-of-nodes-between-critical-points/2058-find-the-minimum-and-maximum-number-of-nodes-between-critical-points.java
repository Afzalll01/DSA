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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int[] ans=new int[2];
        ListNode a=head;
        ListNode b=head.next;
        ListNode c=head.next.next;
        int idx=1;
        int fidx=-1;
        int lidx=-1;
        int minD=Integer.MAX_VALUE;
        int maxD=-1;
        while(c!=null){
            if((b.val > a.val && b.val > c.val) || (b.val <a.val && b.val<c.val)){
                if(fidx==-1) fidx=idx;
                if(lidx!=-1) minD=Math.min(minD,idx-lidx);
                lidx=idx;
            }
            a=b;
            b=c;
            c=c.next;
            idx++;
        }
        if(lidx!=fidx){
            maxD=lidx-fidx;
            ans[0]=minD;
            ans[1]=maxD;
            return ans;    
        }
        ans[0]=-1;
        ans[1]=-1;
        return ans;

    }
}