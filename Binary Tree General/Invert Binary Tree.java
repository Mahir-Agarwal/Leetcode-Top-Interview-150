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
    public TreeNode invertTree(TreeNode root) {
        
        solve(root);
        return root;
    }

    public TreeNode solve(TreeNode root){
        if(root == null) return root;


         solve(root.left);
         solve(root.right);
        //if(left ==null || right == null) return  null;
        TreeNode curr = root.left ;
        root.left = root.right ;
        root.right = curr;
        
        return root ;  
    }
}

//T.C-> O(N) WHERE N IS NO. OF NODES
//S.C-> O(H) WHERE H IS HEIGHT OF THE TREE