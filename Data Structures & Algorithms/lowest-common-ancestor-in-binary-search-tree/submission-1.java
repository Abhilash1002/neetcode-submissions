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
    TreeNode res = null;
    public int isAncestor(TreeNode root,TreeNode p, TreeNode q){
        if(res!=null || root == null)
            return 0;
        int l = isAncestor(root.left,p,q);
        int r = isAncestor(root.right,p,q);
        int c = ((root==q||root==p)?1:0);
        if(l+r+c >= 2 && res==null)
            res = root;
        return l+r+c;
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        isAncestor(root,p,q);
        return res;
    }
}
