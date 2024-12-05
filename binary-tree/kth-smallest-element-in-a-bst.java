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
    int num = 0;
    int count = 0;
    public int kthSmallest(TreeNode root, int k) {
        
        count = k;
        helper(root);
        return num;
    }

    void helper(TreeNode root){
        if(root.left != null) root = root.left;
        count --;
        if(count == 0){
            num = root.val;
            return;
        }
        if(root.right != null) root = root.right;

    }

}