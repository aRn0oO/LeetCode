class Solution {
    public int minimumDeletions(int[] nums) {
        
        int min = nums[0], max = nums[0];
        int n = nums.length;
        int minindex = 0, maxindex = 0;
        if(n == 1) return 1;
        for(int i = 1; i < n;i++){
            if(nums[i]<min){
                minindex = i;
                min = nums[i];
            }
            if(nums[i]>max){
                maxindex = i;
                max = nums[i];
            }
        }
        if(maxindex < n - maxindex){
            if(minindex < n- minindex){
                return Math.max(minindex, maxindex)+1;
            }else return n-minindex+ maxindex+1;
            
        }else{
        if(minindex < n- minindex){
                return minindex+1+ n- maxindex;
        }else return Math.max(n-minindex,n- maxindex);
      
        }
    }
}