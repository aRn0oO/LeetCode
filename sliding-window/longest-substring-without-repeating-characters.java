class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 1;

        for(int i = 0; i < s.length(); i++){
            int [] al = new int[26];
            int curLength = 0;
            for(int j = i; j< s.length();j++){
                int index = s.charAt(j)-'a';
                if(al[index]==0){
                    al[index]++;
                    curLength++;
                }
                else {
                    maxLength = Math.max(curLength, maxLength);
                    break;
                }

            }


        }
        return maxLength;

    }
}