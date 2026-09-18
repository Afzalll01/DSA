
class Solution {
    public ListNode removeNodes(ListNode head) {
        Stack<ListNode> st=new Stack<>();
        ListNode temp=head;
        while(temp!=null){
            while(st.size()>0 && temp.val>st.peek().val){
                st.pop();
            }
            st.push(temp);
            temp=temp.next;
        }
        while(st.size()!=0){
            ListNode top=st.peek();
            st.pop();
            top.next=temp;
            temp=top;
        }
        return temp;
    }
}