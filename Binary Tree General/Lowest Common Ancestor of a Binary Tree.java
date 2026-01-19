/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        if(root ==  null) return null ;
        if(root == p || root == q ) return root ;

        TreeNode left =  lowestCommonAncestor(root.left , p,q);
        TreeNode right =  lowestCommonAncestor(root.right , p,q);

        if(left == null) return right; //  agar yesi two node mil gyi jo dono right me hai toh hume left se null milega
        if(right == null) return left; //  same agar dono node left se hai toh right se null milega 

        return root;
    }
}