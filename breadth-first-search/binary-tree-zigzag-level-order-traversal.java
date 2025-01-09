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
        helper(root, res, 0);
        return res;
    }

    void helper(TreeNode root, List<List<Integer>>res, int level){
        if(root == null) return;
        if(level >= res.size()){
            List<Integer> re = new LinkedList<>();
            res.add(re);
        }
        List<Integer> collection = res.get(level);
        if(level % 2 == 0 ) collection.add(root.val);
        else collection.add(0, root.val);



        helper(root.left, res, level +1);
        helper(root.right, res, level+1);
    }
}