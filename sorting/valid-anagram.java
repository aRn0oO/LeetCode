class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> map = new HashMap<>(); 
        for(int i = 0; i<s.length();i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
        }
        for(char i : t.toCharArray()){
            map.put(i,map.getOrDefault(i,0)-1);
        }
        for(int val: map.values()){
            if (val!=0)return false;
        }
        return true;
    }
}