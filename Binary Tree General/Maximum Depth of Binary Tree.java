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
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0 ;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        int max = Math.max(left,right)+1;
        return max;
    }
}

//T.C-> O(N)
//S.C-> O(H) where H is the height of the tree