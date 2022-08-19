/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if(root == null || root.left == null || root.right == null) return root;
        
        
        dfs(root.left, root.right);
        // Queue<Node> queue = new LinkedList<>();
        // queue.add(root.left);
        // queue.add(root.right);
        // while(!queue.isEmpty()) {
        //     int size = queue.size();
        //     Node curr = queue.poll();
        //     if(curr.left != null) queue.add(curr.left);
        //     if(curr.right != null) queue.add(curr.right);
        //     for(int i=1;i<size;i++) {
        //         Node next = queue.poll();
        //         if(next.left != null) queue.add(next.left);
        //         if(next.right != null) queue.add(next.right);
        //         curr.next = next; 
        //         if(next != null) {
        //             curr = curr.next;
        //         }
        //     }
        // }
        // return root; 
        return root;
    }
    
    private void dfs(Node left, Node right) {
        // base
        if(left == null) return;
        // logic
        left.next = right;
        dfs(left.left, left.right);
        dfs(left.right, right.left);
        dfs(right.left, right.right);
    }
}