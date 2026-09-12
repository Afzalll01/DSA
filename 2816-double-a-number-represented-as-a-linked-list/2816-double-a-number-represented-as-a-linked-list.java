class Solution {
    public ListNode reverse(ListNode crr) {
        if(crr == null) return null;
        if(crr.next == null) return crr;
        ListNode prev = crr.next;
        crr.next = null;
        ListNode b = reverse(prev);
        prev.next = crr;
        return b;
    }
    public ListNode doubleIt(ListNode head) {
        head = reverse(head);
        ListNode temp = head;
        int carry = 0;
        while(temp != null) {
            int x = temp.val * 2 + carry;
            temp.val = x % 10;
            carry = x / 10;
            if(temp.next == null && carry != 0) {
                temp.next = new ListNode(carry);
                break;
            }
            temp = temp.next;
        }
        head = reverse(head);
        return head;
    }
}