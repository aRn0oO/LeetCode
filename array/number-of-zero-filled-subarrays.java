class Solution {
    public long zeroFilledSubarray(int[] nums) {
        int  res = 0, streak = 0;

        for(int num: nums){
            streak = (num ==0)? streak +1: 0;
            res += streak;
        }

        return res;
    }
}