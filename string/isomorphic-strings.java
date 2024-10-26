class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Integer> smap = new HashMap<>();
        Map<Character, Integer> tmap = new HashMap<>();
        for(int i = 0; i< s.length();i++){
            if(!smap.containsKey(s.charAt(i))){
                smap.put(s.charAt(i),i);
            }
            if(!tmap.containsKey(t.charAt(i))){
                tmap.put(t.charAt(i),i);
            }
            if(!tmap.get(t.charAt(i)).equals(smap.get(s.charAt(i)))) return false;

        }
        return true;
    }
}