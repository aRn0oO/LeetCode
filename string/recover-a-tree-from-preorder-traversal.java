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
    int ptr = 0;
    public TreeNode recoverFromPreorder(String traversal) {
        return find(traversal, 0);
    }
    
    public TreeNode find(String traversal, int level){
        if(ptr == traversal.length())
            return null;
        int i = ptr;
        int count = 0;
        while(traversal.charAt(i) == '-'){
            count++;
            i++;
        }
        if(count == level){
            int start = i;
            while(i < traversal.length() && traversal.charAt(i) != '-')
                i++;
            int val = Integer.parseInt(traversal.substring(start, i));
            ptr = i;
            TreeNode root = new TreeNode(val);
            root.left = find(traversal, level + 1);
            root.right = find(traversal, level + 1);
            return root;
        }else
            return null;
    } 
}