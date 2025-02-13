class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int num : nums) {
            if (num < k) pq.add(num);
        }
        int count = 0; 
        while(!pq.isEmpty()){
            int x = pq.poll();
            count++;
            if(pq.isEmpty()) return count; 
            int y = pq.poll();
            int newVal = 2*x+y;
            if(newVal<k)pq.add(newVal);

        }
        return count;
    }
}