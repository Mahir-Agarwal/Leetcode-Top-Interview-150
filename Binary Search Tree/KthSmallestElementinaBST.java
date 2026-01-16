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
    // public int kthSmallest(TreeNode root, int k) {
    //     int leftSideLength = leftSideLen(root.left); // total nodes in left subtree
        
        
    //     if (k <= leftSideLength) {
    //         return kthSmallest(root.left, k); // kth element is in left subtree
    //     } else if (k == leftSideLength + 1) {
    //         return root.val; // current node is the kth smallest
    //     } else {
    //         return kthSmallest(root.right, k - leftSideLength - 1); // move to right subtree
    //     }
    // }

    // public int leftSideLen(TreeNode root) {
    //     if (root == null) return 0;
    //     int left = leftSideLen(root.left);
    //     int right = leftSideLen(root.right);
    //     return left + right + 1; // count all nodes in this subtree
    // }


     public int kthSmallest(TreeNode root, int k) {
        
        int leftSideLen = leftsideLength(root.left);

        if(k<= leftSideLen) {
            return kthSmallest(root.left,k);
        }else if ( k == leftSideLen+1 ){
            return root.val;
        }else{
            return kthSmallest(root.right, k-leftSideLen-1);
        }
    }

    public int leftsideLength(TreeNode root){

        if(root == null) return 0;

        return leftsideLength(root.left)+leftsideLength(root.right) + 1;
    }










}
//T.C -> O(N) in worst case
//S.C -> O(H)