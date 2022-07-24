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
    public List<Integer> largestValues(TreeNode root) {
        
        Queue<TreeNode> queue = new LinkedList<>();
        ArrayList<Integer> res = new ArrayList<>();
        if(root == null ) return res;
        
        queue.add(root);
        // res.add(root.val);
        while(!queue.isEmpty()) {
            int size = queue.size();
            int Max = Integer.MIN_VALUE;
            for(int i=0;i<size;i++) {
                 TreeNode curr = queue.poll();
                 Max = Math.max(Max,curr.val);
                if(curr.left != null) {
                    queue.add(curr.left);
                }
                if(curr.right != null) {
                    queue.add(curr.right);
                }
            }
            res.add(Max);
        }
        return res;
    }
}


//  
//             

            
//             if(curr.right != null) {
//                 Max = Math.max(Max, curr.right.val);
//                 queue.add(curr.right);
//             }
//             res.add(Max);