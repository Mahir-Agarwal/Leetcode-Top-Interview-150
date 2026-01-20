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
    public int countNodes(TreeNode root) {
        if(root== null)
        {
            return 0;
        }
        int l =countNodes(root.left);
        int r = countNodes(root.right);
        return (l+r)+1; 
    }
}

// time complexity: O(n)
// space complexity: O(h) where h is the height of the tree due to recursion stack