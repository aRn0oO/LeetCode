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
    List<List<Integer>> list = new ArrayList<>();

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
       
        helper(root,targetSum, new ArrayList<Integer>());

        return list;
    }
    void helper(TreeNode root, int target, ArrayList<Integer> sol){
        if(root == null){
            
            return;
        }
        sol.add(root.val);
        if (root.left == null && root.right == null && target  == root.val) {
            list.add(new ArrayList<Integer>(sol));
        } else {
            helper(root.left, target - root.val, sol);
            helper(root.right, target - root.val, sol);
        }
        sol.remove(sol.size()-1);
        
        
    }

}