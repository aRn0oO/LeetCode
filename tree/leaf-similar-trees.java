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
    List<Integer>list1 = new ArrayList<>(), list2 = new ArrayList<>();

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        helper(root1, list1);
        helper(root2, list2); 
        if(list1.size()!=list2.size())return false;
        int n = list1.size();
        for(int i = 0; i<n;i++){
            if(list1.get(i)!= list2.get(i)) return false;
        }
        return true;
    }

    void helper(TreeNode root,List<Integer> list){
         if (root == null) return;
        if(root.left == null && root.right == null){
            list.add(root.val);
            return;

        }   

        helper(root.left,list);
        helper(root.right, list);  
    }
}