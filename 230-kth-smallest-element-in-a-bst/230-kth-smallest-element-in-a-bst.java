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
    int size;
    int value;
    public int kthSmallest(TreeNode root, int k) {
      
        size = k;
        helper(root);
        return value;
        
    }
    private void helper(TreeNode root) {
       
        if(size < 0) {
            return;
        }
        if(root == null) {
            return;
        }

        
        helper(root.left);
        size--;
        if(size == 0) {
            value = root.val;
            return;
        }
      
        helper(root.right);
    }
}