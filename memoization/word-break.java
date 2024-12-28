class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        int n = s.length();
        int max_length = 0;
        boolean [] dp = new boolean [n+1];
        dp[0] = true;
        for(String word : wordDict) max_length = Math.max(word.length(), max_length);

        for (int i = 1; i <= n; i++){
            for(int j = i - 1; j>= Math.max(i-max_length-1, 0);j--){
                if ( dp[j] && wordDict.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[n];
    }
}