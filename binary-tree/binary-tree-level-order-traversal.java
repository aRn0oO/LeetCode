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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();

        helper(list, 0, root);
        return list; 
    }

    private void helper(List<List<Integer>> list, int level, TreeNode node){
        if(node == null) return;

        if(level == list.size()){
            List<Integer> re = new ArrayList<>();
            re.add(node.val);
            list.add(re);
        }else list.get(level).add(node.val);

        helper(list, level+1, node.left);
        helper(list, level+1, node.right);
    }
}