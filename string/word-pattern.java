class Solution {
    public boolean wordPattern(String pattern, String s) {  
        Map<Character, String> map = new HashMap<>();
        String[] array = s.split(" ");
        if (array.length!= pattern.length()) return false;

        for(int i = 0; i < pattern.length();i++){
            if(!map.containsKey(pattern.charAt(i))) map.put(pattern.charAt(i), array[i]);
            else if(!map.get(pattern.charAt(i)).equals(array[i])) return false;
        }
        return true;
        
    }
}