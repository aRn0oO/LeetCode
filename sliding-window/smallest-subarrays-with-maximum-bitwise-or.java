class Solution {
    public int[] smallestSubarrays(int[] nums) {
        int n = nums.length;
        int [] lengthList = new int[n];
             

        for(int i = 0; i< n; i++){
            int max = 0;
            for (int k = i; k < n; k++) {
                max |= nums[k];
            }

            int curOr = 0;
            for (int j = i; j<n; j++){
                
                curOr = curOr | nums[j];
                if(curOr == max) {
                    lengthList[i] = j-i+1;
                    break;
                }    
            }

        }
        return lengthList;





    }
}