class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int i = 0, maxlen = 0;
        for(int j = 0; j < s.length();j++){
            if(map.containsKey(s.charAt(j))) {
                i= Math.max(map.get(s.charAt(j))+1,i);
            }
            maxlen = Math.max(maxlen, j - i + 1);
            map.put(s.charAt(j),j);
        }
        return maxlen;
    }
}