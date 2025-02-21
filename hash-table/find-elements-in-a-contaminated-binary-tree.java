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
        dfs(root, 0);

    }
    private void dfs(TreeNode n, int v) {
        if (n == null) return;
        set.add(v);
        n.val = v;
        dfs(n.left, 2 * v + 1);
        dfs(n.right, 2 * v + 2);
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