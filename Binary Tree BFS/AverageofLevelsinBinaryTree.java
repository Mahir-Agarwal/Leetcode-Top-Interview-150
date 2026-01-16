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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double>  list = new ArrayList<>();

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            int size = q.size();
            int rem =size;
            double res =0;
            while(size-- > 0){

                TreeNode curr= q.poll();
                res+= curr.val;

                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }

            }
            list.add( (res/rem));
        }

        return list;

    }
}

//T.C :O(N)
//S.C:O(W) where W is the max width of the tree
    //Best case (skewed tree): w = 1 → O(1)
    //Worst case (complete/balanced tree): w ≈ n/2 → O(n) 