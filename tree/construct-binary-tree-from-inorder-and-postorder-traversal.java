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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return helper(0, inorder.length-1, 0, postorder.length-1, inorder, postorder);
    }
    TreeNode helper(int inStart, int inEnd, int postStart, int postEnd, int[] inorder, int[] postorder ){
        if(inStart>inEnd|| postStart> postEnd) return null;

        TreeNode root = new TreeNode(postorder[postEnd]);
        
        int inIndex =0;
        for(int i = inStart; i <= inEnd; i++){
            if(inorder[i]== postorder[postEnd]){
                inIndex = i;
                break;
            }
        }

        root.left=helper(inStart, inIndex-1, postStart, postEnd-(inEnd-inIndex)-1, inorder,postorder);
        root.right = helper(inIndex+1, inEnd, postEnd-(inEnd-inIndex), postEnd-1, inorder, postorder);
        return root;
    }
}