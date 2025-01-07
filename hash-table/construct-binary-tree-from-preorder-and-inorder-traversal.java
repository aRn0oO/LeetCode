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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return helper(0, 0 , inorder.length-1, preorder, inorder);        
    }

    private TreeNode helper(int preStart, int inStart, int inEnd, int[] pre, int[]in ){
        if(preStart >= pre.length|| inStart> inEnd) return null;

        TreeNode root = new TreeNode(pre[preStart]);
        int cur = 0;
        for(int i = inStart; i<= inEnd; i++){
            if(in[i]== pre[preStart]) {
                cur = i;
                break;
            }
        }
        
        root.left = helper(preStart+1, inStart, cur-1, pre, in);
        root.right= helper(preStart + cur- inStart+1, cur+1, inEnd, pre, in );
        return root;

    }
}