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
    
    int max = Integer.MIN_VALUE;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) return 0;
        
        int lh = findH(root.left);
        int rh = findH(root.right);
        
        max = Math.max(max, lh+rh);
        
        diameterOfBinaryTree(root.left);
        diameterOfBinaryTree(root.right);
        
        return max;
    }
    
    private int findH(TreeNode root) {
        
        if(root == null) return 0;
        
        int leftH = findH(root.left);
        int rightH = findH(root.right);
        
        return 1+Math.max(leftH, rightH);
    }
}