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
    int ans = Integer.MIN_VALUE;
    public int getMax(TreeNode root){
        if(root == null)
            return 0;
        int l = Math.max(getMax(root.left),0);
        int r = Math.max(getMax(root.right),0);

        ans = Math.max(ans, root.val + l + r);

        return root.val + Math.max(l,r);
    }
    public int maxPathSum(TreeNode root) {
        getMax(root);
        return ans;
    }
}
