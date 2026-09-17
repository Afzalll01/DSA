/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        if(head==null) return head;
        Node temp=head;
        while(temp!=null){
            if(temp.child!=null){
                Node a=temp.next;
                Node b=flatten(temp.child);
                temp.next=b;
                temp.child=null;
                b.prev=temp;
                Node t=b;
                while(t.next!=null){
                    t=t.next;
                }
                t.next=a;
                if(a!=null) a.prev=t;
                temp=a;
            }else{
                temp=temp.next;
            }
        }
        return head;
    }
}