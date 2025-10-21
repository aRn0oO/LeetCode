class Solution {
    public int numberOfArithmeticSlices(int[] nums) 
    {
        HashMap<Long,List<Integer>> q1=new HashMap<>();
        int n=nums.length;
        if(n<3) return 0;
        for(int i=0;i<n;i++){
            long x=nums[i];
            q1.computeIfAbsent(x,k->new ArrayList<>()).add(i);
        }
        int[][] dp=new int[n][n];
        int res=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                long prev=2L*nums[i]-nums[j];
                if(prev<Integer.MIN_VALUE||prev>Integer.MAX_VALUE)continue;
                if(q1.containsKey(prev)){
                    for(int it: q1.get(prev)){
                        if(it<i)
                        dp[i][j]+=dp[it][i]+1;
                        else
                        break;
                    }
                }
                res+=dp[i][j];
            }
        }
        return res;
    }
}