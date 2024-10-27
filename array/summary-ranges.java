class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<>();
        int slow = 0;
        
        for (int i=1; i <= nums.length;i++){
            if(i == nums.length||nums[i] != nums [i-1]+1 ){
                if(slow == i -1){
                    res.add(String.valueOf(nums[slow]));
                }else{
                    res.add(nums[slow]+"->"+nums[i-1]);
                }
                slow = i;
            }

        }
        return res;
    }
}