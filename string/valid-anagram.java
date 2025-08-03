class Solution {
    public boolean isAnagram(String s, String t) {
        int n = s.length();
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i<n ; i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
        }

        for(Character c : t.toCharArray()){
            if(!map.containsKey(c)) return false;
        }
        return true;
    }
}