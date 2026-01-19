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
    public int max ;
    public int maxPathSum(TreeNode root) {
        max  =Integer.MIN_VALUE;
        solve(root);

        return max;
        
    }
    public int solve(TreeNode root){
        if(root == null) return 0;


        int left = Math.max(0,solve(root.left));
        int right = Math.max(0,solve(root.right));

        int ifRootISBest = root.val;

        int entierSubTreeIsBest= root.val + left+right;

        int leftOrRightPartIsBest = root.val + Math.max(left,right);

        max = Math.max(max , Math.max(ifRootISBest , Math.max(entierSubTreeIsBest,leftOrRightPartIsBest))) ;

        return Math.max(leftOrRightPartIsBest,ifRootISBest); //we are not including "entierSubTreeIsBest" coz we already got best so not need to include 
    }
}