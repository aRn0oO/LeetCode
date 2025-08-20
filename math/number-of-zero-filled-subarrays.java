class Solution {
    public long zeroFilledSubarray(int[] nums) {
        int n = nums.length, res = 0;
        int[] dp = new int[n+1];

        for(int i = 0; i < n; i++){
            if(nums[i]==0)dp[i+1]= dp[i]+1;
            res+= dp[i+1];
        }

        return res;
    }
}