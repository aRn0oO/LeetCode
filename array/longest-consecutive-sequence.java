class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int res = 0;
        for(int i : nums){
            if(!set.contains(i-1)){
                int length =1 ;
                while(set.contains(i+length)){
                    length ++;
                }
                res = Math.max(res, length);
            }
            
        }
        return res;
    }
}