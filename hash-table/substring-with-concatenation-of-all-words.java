class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        Map<String, Integer> map = new HashMap<>();
        for(String word : words){
            map.put(word, map.getOrDefault(word,0)+1);
        }

        List<Integer> res = new ArrayList<>();
        int slength = s.length();
        int wordsnum = words.length;
        int wordlength = words[0].length();
        
        for (int i = 0; i< slength-wordsnum*wordlength +1; i++){
            String sub = s.substring(i,i+wordsnum*wordlength);
            Map<String, Integer>seen = new HashMap<>();
            for (int j = 0; j< sub.length(); j +=wordlength){
                String subsub = sub.substring(j, j+wordlength);
                seen.put(subsub, seen.getOrDefault(subsub,0)+1);
            }
            if(seen.equals(map)) res.add(i);
        }
        
        return res;

    }
}