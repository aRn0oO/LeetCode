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
        Node dummy = new Node(0);// will point to each layer
        Node pre = dummy;// Node that move to build layer
        Node res = root;

        while(root!= null){
            if(root.left!=null){
                pre.next = root.left;
                pre = pre.next;
            }
            if(root.right!=null){
                pre.next = root.right;
                pre = pre.next;
            }
            root = root.next;
            if(root== null){
                pre = dummy;
                root = dummy.next; // move to the next layer
                dummy.next = null;
            }
        }
        return res;
    }
}