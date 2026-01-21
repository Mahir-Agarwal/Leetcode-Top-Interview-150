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
    public int idx=0;
    public TreeNode buildTree(int[] inorder, int[] postorder) {

        int n = inorder.length;
        idx = n-1;
        return solve( 0, n-1 , inorder ,postorder );

    }

    public TreeNode solve(int s, int e , int inorder[],int postorder[]){

        if(s > e){
            return  null;
        }
        if(idx <0) return null;
        int val = postorder[idx--];

        int i = s;
        for(; i<=e ; i++){
            if(inorder[i]==val) break;
        }

        TreeNode root = new TreeNode(val);
        root.right=solve(i+1,e ,inorder,postorder);
        root.left =solve(s,i-1 ,inorder,postorder);

        return root;
    }
}

//T.C -> O(N)
//S.C -> O(H)