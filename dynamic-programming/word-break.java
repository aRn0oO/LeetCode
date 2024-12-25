class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        return wordBreak(0,s, new HashSet(wordDict));

    }

    boolean wordBreak(int p, String s, Set<String> wordDict){
        int n = s.length();
        if(p == n) return true;
        for(int i = p+1; i <= n; i ++){
            if(wordDict.contains(s.substring(p,i))&&wordBreak(i,s, wordDict)) return true;
        }
        return false;
    }
}