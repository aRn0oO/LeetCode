class Solution {
    public long countBadPairs(int[] nums) {
        long count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int prev= map.getOrDefault(i-a[i],0);
            count+= i- prev;
            map.put(i-a[i],prev+1);
        }
        return count;
    }

    
}