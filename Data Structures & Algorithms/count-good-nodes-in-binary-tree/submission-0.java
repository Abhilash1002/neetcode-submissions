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
    public int recur(TreeNode root, int currMax){
        if(root == null)
            return 0;
        if(root.val >= currMax){
            // System.out.print(root.val + " ");
            return recur(root.left,root.val) + recur(root.right,root.val) + 1;
        }
        return recur(root.left,currMax) + recur(root.right,currMax);
    }
    public int goodNodes(TreeNode root) {
        return recur(root,-101);
    }
}
