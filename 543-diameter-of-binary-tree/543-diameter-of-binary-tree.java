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
        
       
        calHeight(root);
        
        
        //TC: O(N**2) - for each node, we are calculating the left height and right height. 
        // Hence we are traversing all the nodes twice.
        // SC: O(H) 
        
//         if(root == null) return 0;
        
//         int lh = findH(root.left);
//         int rh = findH(root.right);
        
//         max = Math.max(max, lh+rh);
        
//         diameterOfBinaryTree(root.left);
//         diameterOfBinaryTree(root.right);
        
        return max;
    }
    
    private int calHeight(TreeNode root) {
        if(root == null) return 0;
      
        //LOGIC 
        int dl = calHeight(root.left);
        int dr = calHeight(root.right);
        
        max = Math.max(max, dl+dr);
        return 1+Math.max(dl, dr);
    }
    
    private int findH(TreeNode root) {
        
        if(root == null) return 0;
        
        int leftH = findH(root.left);
        int rightH = findH(root.right);
        
        return 1+Math.max(leftH, rightH);
    }
}