class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.isEmpty()) return 0;

        Map<Character, Integer> map = new HashMap();
        int ans = 0;
        
        for (int i = 0, start = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                //this is needed to find the next index for consequent repeating chars e.g. abba
                start = Math.max(map.get(s.charAt(i)), start);
            } 
            ans = Math.max(ans, ((i+1)-start));
            map.put(s.charAt(i), i+1);
        }

        return ans;
    }
}