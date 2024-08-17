class Solution {
    public int rob(int[] nums) {
        int rob = 0, norob = 0;
        for (int i = 0; i<nums.length;i++){
          int newrob = norob + nums[i];
          int newnorob = Math.max(rob, norob);
          rob = newrob;
          norob = newnorob;
        }
        return Math.max(norob, rob);
    }
}