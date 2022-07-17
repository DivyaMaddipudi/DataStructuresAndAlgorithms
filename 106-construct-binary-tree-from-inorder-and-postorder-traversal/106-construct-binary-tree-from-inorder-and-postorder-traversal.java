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
    HashMap<Integer, Integer> hm = new HashMap<>();
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        
        if(inorder == null || inorder.length== 0 || postorder == null || postorder.length == 0) {
            return null;
        }
        
        for(int i=0;i<inorder.length;i++) {
            hm.put(inorder[i], i);
        }
        
        //OPTIMIZED
        return helper(inorder, 0, inorder.length-1, postorder, 0, postorder.length-1);
        
        
        
        
        //BRUTE FORCE
        
        // TC: O(N**2)
        // SC: O(N**2)
        
//         int rootVal = postorder[postorder.length - 1];
//         TreeNode root = new TreeNode(rootVal);
        
//         int rootIdx = 0;
//         for(int i=0;i<inorder.length;i++) {
//             if(inorder[i] == rootVal) {
//                 rootIdx = i;
//                 break;
//             }
//         }
        
//         int[] inLeft = Arrays.copyOfRange(inorder, 0, rootIdx);
//         int[] inRight = Arrays.copyOfRange(inorder, rootIdx+1, inorder.length);
//         int[] postLeft = Arrays.copyOfRange(postorder, 0, rootIdx);
//         int[] postRight = Arrays.copyOfRange(postorder, rootIdx, postorder.length-1);
        
//         root.left = buildTree(inLeft, postLeft);
//         root.right = buildTree(inRight, postRight);
//         return root;
    }
    
    private TreeNode helper(int[] inorder, int inStart, int inEnd, int[] postorder, int postStart, int postEnd) {
        
        if(inStart > inEnd || postStart > postEnd) return null;
        
        TreeNode root = new TreeNode(postorder[postEnd]);
        // System.out.println(root.val);
        int rootIdx = hm.get(root.val);
        int numsleft = rootIdx - inStart;
        
        root.left =  helper(inorder, inStart, rootIdx - 1, postorder, postStart, postStart + numsleft-1);
        root.right = helper(inorder, rootIdx+1, inEnd, postorder, postStart + numsleft, postEnd - 1);
        
        return root;
        
    }
}