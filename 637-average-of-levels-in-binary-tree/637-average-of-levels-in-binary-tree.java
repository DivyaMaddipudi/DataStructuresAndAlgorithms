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
    public List<Double> averageOfLevels(TreeNode root) {
        
        // BFS
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int lvl = 1;
        List<Double> list = new ArrayList<>();
        while(!queue.isEmpty()) {
            int size = queue.size();
            Double sum = 0.0;
            for(int i=0;i<size;i++) {
                TreeNode curr = queue.poll();
                if(curr.left != null) queue.add(curr.left);
                if(curr.right != null) queue.add(curr.right);
                sum += curr.val;
            }
            Double val = sum/size;
            list.add(val);
        }
        return list;
        
    }
}