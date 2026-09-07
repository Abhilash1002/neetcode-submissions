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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a, b) -> a.val - b.val);
        int n = lists.length;
        for(ListNode l:lists){
            if(l!=null)
                pq.add(l);
        }
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        while(!pq.isEmpty()){
            ListNode curr = pq.poll();
            if(curr.next != null)
                pq.add(curr.next);  
            temp.next = curr;
            temp = curr;
        }
        return dummy.next;
    }
}
