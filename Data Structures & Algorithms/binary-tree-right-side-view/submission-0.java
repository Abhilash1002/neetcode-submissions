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
    List<Integer> res = new ArrayList<>();
    public void traverse(TreeNode root, int currDepth){
        if(root == null)
            return;
        if(currDepth == res.size())
            res.add(root.val);
        traverse(root.right,currDepth+1);
        traverse(root.left,currDepth+1);
    }
    public List<Integer> rightSideView(TreeNode root) {
        traverse(root,0);
        return res;
    }
}
