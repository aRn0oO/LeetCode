class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> res = new ArrayList<>();
        int[] target = new int[26];
        for(String word: words2){
            int[]temp = new int[26];
            for( char ch : word.toCharArray()){
                temp[ch-'a']++;
                target[ch-'a'] = Math.max(target[ch-'a'], temp[ch-'a']);
            }
        }
        for(String word: words1){
            int[] source = new int[26];
            for(char ch : word.toCharArray()) source[ch-'a']++;

            if(helper(source, target)) res.add(word);

        }
        return res;
    }
    boolean helper(int[] parent, int [] child){
        for(int i=0;i<26;i++){
            if(parent[i]<child[i]) return false;
        }
        return true;
    }
}