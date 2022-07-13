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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> al = new ArrayList<>();
        
        if(root == null) return al;
        Stack<TreeNode> st = new Stack<>();

        TreeNode node = root;
        while(true) {
            
           if(node != null) {
               st.push(node);
               node = node.left;
           } else {
               if(st.isEmpty()) {
                   break;
               }
                
               node = st.pop();
               al.add(node.val);
                // al.add(st.pop().val);  // gives null pointer exception
               // if(node.right != null) {
                node = node.right;
               // }
           }
            
            
        }
        return al;        
    }
}