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
    
    public List<Integer> preorderTraversal(TreeNode root) {
        Stack<TreeNode> st = new Stack<>();
        List<Integer> al = new ArrayList<>();
        
        if(root == null) return al;
        TreeNode node;
        st.push(root);
        while(!st.isEmpty()) {
            node = st.pop();
            al.add(node.val);
            if(node.right  != null) st.push(node.right);
            if(node.left != null ) st.push(node.left);
        }
        return al;
    }
}