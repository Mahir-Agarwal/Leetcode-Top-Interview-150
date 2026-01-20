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

class BSTIterator {

    Stack<TreeNode> stack = new Stack<>();
    public BSTIterator(TreeNode root) {

        pushLeftStuff(root);
    }

    public void pushLeftStuff(TreeNode root){

        while(root!=null){
            stack.push(root);
            root = root.left;
        }

    }
    
    public int next() {
        TreeNode curr = stack.pop();
        
        if(curr.right != null){
            pushLeftStuff(curr.right);
        }

        return curr.val;
    }
    
    public boolean hasNext() {
        return !stack.isEmpty();
    }

}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */

//T.C-> O(1) amortized  how ? Each node is pushed and popped exactly once 
//S.C-> O(H) where h  is the height of the tree