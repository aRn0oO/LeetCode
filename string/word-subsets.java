class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> res = new ArrayList<String>();
        for(String word: words1){
            if(helper(word, 0, words2)) res.add(word);
        }
        return res;
    }
    boolean helper(String word, int index, String[] words2){
        if(index>= words2.length) return true;
        return word.contains(words2[index])&&helper(word, index+1, words2);
    }
}