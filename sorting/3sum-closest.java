class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int minSum = Integer.MAX_VALUE;
        Arrays.sort(nums);
        
        for(int i = 0; i< nums.length; i++){
            int l = i +1, r = nums.length-1;
            while(l < r){

                int distance = nums[i]+ nums[l] + nums[r];
                if(Math.abs(distance -target) < Math.abs(minSum - target)){
                    minSum= distance;

                }
                if(distance > target){
                    r --;

                }else if(distance < target){
                    l++;
                }else return distance;

            }
            
        }
        return minSum;
    }
}