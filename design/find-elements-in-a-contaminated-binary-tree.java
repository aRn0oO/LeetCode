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
class FindElements {
    int val = 0;
    Set<Integer> set = new HashSet<>();

    public FindElements(TreeNode root) {
        if(val == 0){
            root.val = val;
            val =-1;
            
        }
        root.left.val = root.val*2+1;
        root.right.val = root.val*2+2;
        set.add(root.val);
        FindElements(root.left);
        FindElements(root.left);
        



    }
    
    public boolean find(int target) {
        return set.contains(target);
    }
}

/**
 * Your FindElements object will be instantiated and called as such:
 * FindElements obj = new FindElements(root);
 * boolean param_1 = obj.find(target);
 */