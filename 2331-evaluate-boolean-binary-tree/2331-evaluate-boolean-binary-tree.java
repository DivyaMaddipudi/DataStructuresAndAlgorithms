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
    public boolean evaluateTree(TreeNode root) {

        if(root.left == null || root.right == null) {
            if(root.val == 0) {
                return false;
            } else {
                return true;
            }
        }
        
        
        
       int value = checkValue(root);
        if(value == 0) {
            return false;
        } else {
            return true;
        }
    }
    
    private int checkValue(TreeNode root) {
        
        if(root.left == null ) {
            if(root.val == 0) {
                return 0;
            } else {
                return 1;
            }
        } 
        
        int l = checkValue(root.left);
        System.out.println(root.val);
        int prev = root.val;
        int r = checkValue(root.right);
        // System.out.println(l + " --- " + r);
        
        if(prev == 2) {
           if(l == 0 && r == 0) {
               return 0;
           } else {
               return 1;
           }
        } else {
            if(l == 1 && r == 1) {
               return 1;
           } else {
               return 0;
           }
        }
    }
}