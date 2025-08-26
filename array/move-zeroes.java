class Solution {
    public void moveZeroes(int[] nums) {
       int point = 0;                  // number of zeros seen so far
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                point++;                // accumulate zeros
            } else if (point != 0) {    // we’ve seen 'point' zeros before this i
                nums[i - point] = nums[i]; // shift current non-zero left by 'point'
                nums[i] = 0;               // leave a zero in current position
            }
        }
    
    }
    
}