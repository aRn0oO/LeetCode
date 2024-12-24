class Solution {
    public int rob(int[] nums) {
        int rob = 0, notrob = 0;
        for( int i = 0; i < nums.length; i++){
            int currrob = notrob + nums[i];
            notrob = Math.max(notrob, rob);
            rob = currrob;
        }
        return Math.max(rob, notrob);
    }
}