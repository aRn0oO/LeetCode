class Solution {
    public int rob(int[] nums) {
        int a = 0, b = 0;
        for(int i = 0; i < nums.length; i=i+2)a += nums[i];
        for(int i = 1; i <nums.length; i = i +2) b += nums[i];

        return Math.max(a, b);
    }
}