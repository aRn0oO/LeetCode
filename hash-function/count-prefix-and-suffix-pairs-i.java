class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int count =0;
        for(int i = 0; i < words.length; i++){
            for(int j = i+1; j< words.length; j++){
                if(isPrefixAndSuffix(words[i],words[j])) count ++;
            }
        }
        return count;
    }
    private boolean isPrefixAndSuffix(String s1, String s2){
        if(s1.length()>s2.length()) return false;
        return s2.substring(0,s1.length()).equals(s1)&&s2.substring(s2.length()-s1.length()).equals(s1);
    }
}