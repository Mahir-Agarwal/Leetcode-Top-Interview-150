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
    public int sumNumbers(TreeNode root) {
        if(root == null) return 0;
        
        return solve( 0,  root);
    }

    public int solve(int curr , TreeNode root ){

        if(root == null) return 0 ;

        curr = curr*10 + root.val;

        if(root.left == null && root.right ==null) return curr ;

        int left = solve(curr , root.left );
        int right= solve(curr , root.right );

        return left+right;
    }
}

//T.C -> O(N)  where n is no of nodes in the tree
//S.C -> O(H)  where h is height of the tree due to recursive stack space