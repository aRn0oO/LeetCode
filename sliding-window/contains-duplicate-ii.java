class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        for(int i = 0; i<nums.length-k; i++){
            for (int j = 1; j<= k; j++){
                if(nums[i+j]== nums[i]){
                    return true;
                }
            }
        }
        return false;
    }
}