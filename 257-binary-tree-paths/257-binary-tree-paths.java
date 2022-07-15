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
    
    List<String> result;
    public List<String> binaryTreePaths(TreeNode root) {
        result = new ArrayList<>();
        
        helper(root, "");
        return result;
        
    }
    
    private void helper(TreeNode root, String path) {
        
        if(root == null) return;
        
        //logic
        if(root.left != null || root.right != null) {
            path += String.valueOf(root.val) + "->";
        } 
        
        if(root.left == null && root.right == null) {
            path += String.valueOf(root.val);
            System.out.println(root.val);
            result.add(path);
            return;
        }
        helper(root.left, path);
        helper(root.right, path);
        
        
        
    }
}