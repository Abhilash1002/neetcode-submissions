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
    public boolean check(TreeNode root,int l,int r){
        if(root == null)
            return true;
        return !(l>=root.val || r<=root.val) && check(root.left,l,root.val) && check(root.right,root.val,r);
    }
    public boolean isValidBST(TreeNode root) {
        return check(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }
}
