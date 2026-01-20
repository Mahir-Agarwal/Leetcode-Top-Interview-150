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
    public boolean isSymmetric(TreeNode root) {
        
        return solve(root, root);
    }

    public boolean solve(TreeNode p , TreeNode q ){

        if(p == null && q == null) return true;
        if(p == null || q == null) return false;

        if(p.val !=q.val) return false; 

        return solve(p.left , q.right ) && solve(q.left,p.right );
    }
}

//T.C-> O(N) WHERE N IS NO. OF NODES
//S.C-> O(H) WHERE H IS HEIGHT OF THE TREE 