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
    public int idx =0 ;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n =  preorder.length;
        return solve(0,n-1,preorder , inorder);// s , e , idx , preorder, inorder

    }

    public TreeNode solve(int  s, int e   ,int preorder[] , int inorder[]){
        if(s > e) return null;

        int rootval = preorder[idx++];
        int i = s ;

        for( ; i<=e ; i++){
            if(rootval == inorder[i]) break;
        }
        
        TreeNode root = new TreeNode(rootval);

        root.left = solve(s , i-1  , preorder , inorder);
        root.right = solve(i+1,e , preorder , inorder);

        return root ;
    }
}