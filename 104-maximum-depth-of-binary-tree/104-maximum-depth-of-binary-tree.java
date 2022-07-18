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
    public int maxDepth(TreeNode root) {
        
        if(root == null) return 0;
        
        int l = maxDepth(root.left);
        int r = maxDepth(root.right);
        
        return 1+Math.max(l, r);
        // helper(root, 0);
        // return max+1;
    }
    
    private void helper(TreeNode root, int count) {
        // System.out.println(count + " count ");
        if(root == null) {
            max = Math.max(max, count);
            return;
        }
        System.out.println(count + " pre " + root.val);
        if(root.left != null || root.right != null) {
            count++;
        }
        helper(root.left, count);
        System.out.println(count + " in " + root.val);
        helper(root.right, count);
        System.out.println(count + " post " + root.val);
        
    }
}