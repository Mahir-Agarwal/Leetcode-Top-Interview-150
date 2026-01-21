/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if(root == null) return root ;
        Queue<Node> q =  new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            int size = q.size();
            Node prev = null;
            while(size--> 0){

                Node curr = q.poll();
                if(prev ==null ) curr.next = null ;
                curr.next = prev;
                prev = curr; 
                if(curr.right !=null) q.add(curr.right);
                if(curr.left !=null) q.add(curr.left);
            }
            
        }
        return root;
    }
}

//T.C -> O(N) where n is the number of nodes in the binary tree
//S.C -> O(N) for the queue data structure