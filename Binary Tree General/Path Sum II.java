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
    public List<List<Integer>> res ;
    
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        res  = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        if(root == null) return res;

        solve(root ,targetSum , list );

        return res;
    }

    public void solve(TreeNode root , int target , List<Integer> list ){

        if(root ==null  ) return ;

        list.add(root.val);;

        if(target == root.val && root.left ==null && root.right == null ){
            res.add(new ArrayList<>(list));
            
        }
    
        //list.add(root.val);

        solve(root.left , target-root.val , list);
        solve(root.right , target-root.val , list);

        list.remove(list.size()-1);
    }
}