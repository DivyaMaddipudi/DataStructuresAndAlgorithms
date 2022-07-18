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
    boolean isValid;
    public boolean isSymmetric(TreeNode root) {
        
        isValid = true;
        helper(root.left, root.right);
        
        return isValid;
    }
    
    public void helper(TreeNode left, TreeNode right) {
        if(left == null && right == null) {
            return;
        }
        
        if(left == null || right == null || left.val != right.val ) {
            isValid = false;
            return;
        }
        
        //logic
        helper(left.left, right.right);
        helper(left.right, right.left);
        
    }
}