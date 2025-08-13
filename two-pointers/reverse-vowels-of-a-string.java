class Solution {
    public String reverseVowels(String s) {
        char[] word = s.toCharArray();
        List vowels = List.of('a', 'e', 'i','o','u','A','E','I','O','U');
        int l =0 , r = s.length()-1;

        while(l < r){
            while(l<r && !vowels.contains(word[l])){
                l++;
            }
            while(l<r && !vowels.contains(word[r])){
                r--;
            }
            char temp = word[l];
            word[l] = word[r];
            word[r] = temp;
            l++;
            r--;
        }
        String answer = new String(word);
        return answer;
    }

}