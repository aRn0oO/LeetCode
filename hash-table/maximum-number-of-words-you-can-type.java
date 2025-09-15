class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        Set<Character> set = new HashSet<>();

        for(char c : brokenLetters.toCharArray()){
            set.add(c);
        }    

        
        String[] words = text.split(" ");
        int count = 0;
        for (String word : words) {
            for (char c : word.toCharArray()) {
                if (set.contains(c)) {
                    count++;
                    break;
                }
            }
        }

        return words.length - count;

    }
}