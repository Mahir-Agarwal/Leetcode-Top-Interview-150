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
    public TreeNode prev = null;
    public int min = Integer.MAX_VALUE; 
    public int getMinimumDifference(TreeNode root) {
        
        List<Integer> list = new ArrayList<>();

        inorder(root,list);

        // int min = Integer.MAX_VALUE;
        //  for (int i = 1; i <list.size() ; i++){
        //     min = Math.min(min , Math.abs(list.get(i)-list.get(i-1)));
        //  }

         return min;
    }

    public void inorder(TreeNode root , List<Integer> list){
        
        if(root == null) return ;

        inorder(root.left , list);

        if(prev !=null ) min = Math.min(min , Math.abs(prev.val-root.val));
        prev  = root ;
        inorder(root.right , list);
    }
}

//T.C -> O(N)
//S.C -> O(H)