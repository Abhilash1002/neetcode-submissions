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
    public boolean checkHasKnodes(ListNode head, int k){
        int i = 0;
        while(head != null){
            i++;
            head = head.next;
            if(i >= k) return true;
        }
        return false;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null)
            return null;
        if(!checkHasKnodes(head,k)){
            return head;
        }
        int t = k;
        ListNode kTail = head;
        ListNode prev = null, curr = head;
        while(t-->0 && curr!=null){
            ListNode temp = curr.next;
            curr.next = prev;   
            prev = curr;
            curr = temp;
        }
        kTail.next = reverseKGroup(curr,k);
        return prev;
    }
}
