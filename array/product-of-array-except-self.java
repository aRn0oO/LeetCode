class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        for (int i= 0; i < nums.length; i++){
            int temp =1;
            for(int j = 0; j< nums.length;j++){
                if(j== i) continue;
                temp = temp*nums[j];
            }
            res[i]=temp;
        }
        return res;
    }
}