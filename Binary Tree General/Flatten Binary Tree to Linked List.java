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
    public TreeNode prev=  null;
    public void flatten(TreeNode root) {

        if(root == null) return ;
        
        flatten(root.right);
        flatten(root.left);
        root.right = prev;
        root.left = null ;
        prev = root;

 
    }
   
}

//T.C - > O(n) where n is the number of nodes in the binary tree
//S.C - > O(h) where h is the height of the binary tree due to recursion stack