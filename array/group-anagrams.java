class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String word:strs){
            char [] words = word.toCharArray();
            Arrays.sort(words);
            String sortword = new String(words);
            
            if(!map.containsKey(sortword)) map.put(sortword,new ArrayList<String>());

            map.get(sortword).add(word);
        }
        return new ArrayList<>(map.values());
    }
}