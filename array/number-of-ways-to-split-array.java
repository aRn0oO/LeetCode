class Solution {
    public int waysToSplitArray(int[] nums) {
        int count = 0;
        int n = nums.length;
        for(int i = 0; i < n-1;i++){
            int l = 0, r = 0;
            for(int j = 0; j<= i; j ++){
                l += nums[j];
            }
            for(int j= i+1; j < n;j++){
                r += nums[j];
            }
            if (l>= r) count ++;
        }
        return count;
    }
}