/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head == null) return null;
        Node curr = head;
        while(curr != null){
            Node dup = new Node(curr.val);
            dup.next = curr.next;
            curr.next = dup;
            curr = dup.next;
        }
        curr = head;
        while(curr != null){
            Node dup = curr.next;
            if(curr.random != null)
                dup.random = curr.random.next;
            else
                dup.random = null;
            curr = dup.next;
        }
        curr = head;
        Node ans = head.next;
        while(curr!=null){
            Node dup = curr.next;
            curr.next = dup.next;
            if(curr.next != null)
                dup.next = curr.next.next;
            else   
                dup.next = null;
            curr = curr.next;
        }
        return ans;
    }
}
