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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> ans = new ArrayList<>();
        
        if (root == null) return ans; 
        
        queue.add(root);
        int flag = 0;
        while(!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> al = new ArrayList<>();
            for(int i=0;i<size;i++) {
                TreeNode node = queue.poll();
                if(node.left != null) queue.offer(node.left);
                if(node.right != null) queue.offer(node.right);
                al.add(node.val);
            }
             if(flag == 0) {
                ans.add(al);
                 flag = 1;
            } else {
                List<Integer> rev = new ArrayList<>();
                 
                for(int i=al.size()-1;i>=0;i--) {
                    rev.add(al.get(i));
                }  
                  ans.add(rev);
                    flag = 0;
            }
        }
        return ans;
    }
}