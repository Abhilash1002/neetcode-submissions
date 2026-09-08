/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null)
            return new ArrayList<List<Integer>>(){};
        TreeNode dummy = new TreeNode(-1);
        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.addLast(root);
        queue.addLast(dummy);
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        while(queue.size()>1){
            TreeNode curr = queue.pollFirst();
            if(curr == dummy){
                res.add(temp);
                temp = new ArrayList<>();
                queue.addLast(dummy);
                continue;
            }
            temp.add(curr.val);
            if(curr.left!=null) queue.addLast(curr.left);
            if(curr.right!=null) queue.addLast(curr.right);
        }
        res.add(temp);
        return res;
    }
}
