class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i = 0 , min = Integer.MAX_VALUE, sum =0;
        for(int j = 0; j< nums.length;j++){
            sum+= nums[j];
            if(sum>= target) {
                while(sum>= target){
                    min = Math.min(min, j-i+1);
                    sum-= nums[i];
                    i++;
                }
            }
        }
        return min == Integer.MAX_VALUE? 0: min;
    }
}