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
    boolean res = true;
    int dfs(TreeNode root){
        if(!res || root == null)
            return 0;
        int l = dfs(root.left);
        int r = dfs(root.right);
        if(Math.abs(r-l) >= 2) 
            res = false;
        return Math.max(l,r)+1;
    }
    public boolean isBalanced(TreeNode root) {
        dfs(root);
        return res;
    }
}
