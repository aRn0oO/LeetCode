class Solution {
    public int waysToSplitArray(int[] nums) {
        int count = 0;
        int n = nums.length;
        int l = 0, r = 0;
        for(int i : nums) r+=i;
        for(int i = 0; i < n-1;i++){
            l+= nums[i];
            r-= nums[i];

            if(l>=r) count ++;
        }
        return count;
    }
}