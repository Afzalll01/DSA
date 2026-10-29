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
    public int numComponents(ListNode head, int[] nums) {
        int count=0;
        ListNode temp=head;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int ele:nums) map.put(ele,1);
        while(temp!=null){
            if(map.containsKey(temp.val)){
                while(temp!=null && map.containsKey(temp.val)){
                    temp=temp.next;
                }
                count++;
            }
            else temp=temp.next;
        }
        return count;
    }
}