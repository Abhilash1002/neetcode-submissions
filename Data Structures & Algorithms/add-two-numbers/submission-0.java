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
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        int carry = 0;
        while(l1 != null || l2 != null){
            int newVal = carry;
            if(l1 != null){
                newVal += l1.val;
                l1 = l1.next;
            }
            if(l2 != null) {
                newVal += l2.val;
                l2 = l2.next;
            }  
            dummy.next = new ListNode(newVal%10);
            dummy = dummy.next;
            carry = newVal/10;
            // l1 = l1.next; l2 = l2.next;
        }
        if(carry == 1)
            dummy.next = new ListNode(1);
        return temp.next;
    }
}
