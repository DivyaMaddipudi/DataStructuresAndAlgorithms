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
    public List<Integer> postorderTraversal(TreeNode root) {
        
        Stack<TreeNode> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        List<Integer> al = new ArrayList<>();
        
        if(root == null) return al;
        
        st1.push(root);
        TreeNode node;
        while(!st1.isEmpty()) {
            node = st1.pop();
            st2.push(node.val);
            if(node.left != null) st1.push(node.left);
            if(node.right != null) st1.push(node.right);
        }
        
        while(!st2.isEmpty()) {
            al.add(st2.pop());
        }
        return al;
        
    }
}