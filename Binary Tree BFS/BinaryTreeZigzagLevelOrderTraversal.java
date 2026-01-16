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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> res = new ArrayList<>();
        if (root == null)
            return res;

        LinkedList<TreeNode> q = new LinkedList<>();

        q.add(root);
        int level = 0;
        while (!q.isEmpty()) {

            int size = q.size();
            
            if (level % 2 == 0) {
                List<Integer> list = new ArrayList<>();
                for (int i = 0; i < size; i++) {
                    TreeNode curr = q.pollFirst();

                    list.add(curr.val);

                    if (curr.left != null) {
                        q.addLast(curr.left);
                    }
                    if (curr.right != null) {
                        q.addLast(curr.right);
                    }
                }
                res.add(new ArrayList<>(list));
            } else {
                List<Integer> list = new ArrayList<>();

                for (int i = 0; i < size; i++) {

                    TreeNode curr = q.pollLast();

                    list.add(curr.val);

                    if (curr.right != null) {
                        q.addFirst(curr.right);
                    }
                    if (curr.left != null) {
                        q.addFirst(curr.left);
                    }
                }
                res.add(list);
            }

            level++;
        }

        return res;
    }
}