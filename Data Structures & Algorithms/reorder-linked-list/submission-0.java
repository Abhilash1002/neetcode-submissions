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
    public void reorderList(ListNode head) {
        Deque<ListNode> deque = new ArrayDeque<>();
        ListNode curr = head;
        while(curr != null){
            deque.offerLast(curr);
            curr = curr.next;
        }
        ListNode dummy = new ListNode(), tail = dummy;
        boolean parity = true;
        while(!deque.isEmpty()){
            ListNode x;
            if(parity)
                x = deque.pollFirst();
            else
                x = deque.pollLast();
            parity = !parity;
            tail.next = x;
            tail = x;
        }
        tail.next = null;
    }
}
