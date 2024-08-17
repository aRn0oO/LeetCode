class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int l, r;
        
        for(int i = 0; i <nums.length;i++){
            if (nums[i]>0)return result;
            if (i!=0&&nums[i]==nums[i-1]) continue;
            l = i+1;
            r = nums.length-1;
            while(l<r){
                if ((nums[i]+nums[l]+nums[r]) < 0) l++;
                else if ((nums[i]+nums[l]+nums[r]) >0) r--;
                else {
                    result.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    while(l<r&& nums[r] ==nums[r-1])r--;
                    while(l<r&& nums[l] == nums[l+1]) l++;
                    
                    l++;
                    r--;
                }
            
            }

            
        }
        return result;
    }
}