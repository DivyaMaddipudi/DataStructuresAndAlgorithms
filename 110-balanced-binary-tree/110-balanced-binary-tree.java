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
    public boolean isBalanced(TreeNode root) {
        
        if(checkBT(root) != -1) {
            return true;
        } else {
            return false;
        }
        
    }
    
    private int checkBT(TreeNode root) {
         if(root == null) return 0;
        
        //logic 
        
        int lh = checkBT(root.left);
        System.out.println(lh);
        if(lh == -1) {
            return -1;
        }
        
        int rh = checkBT(root.right);
        if(rh == -1) {
            return -1;
        }
        
        if(Math.abs(lh - rh) > 1) {
            return -1;
        }
        
        
        return 1+Math.max(lh, rh);
    }
}