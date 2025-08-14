class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()<2) return s.length();
        int maxLength = 0;

        for(int i = 0; i < s.length(); i++){
            int [] al = new int[256];
            int curLength = 0;
            for(int j = i; j< s.length();j++){
                
                if(al[s.charAt(j)]==0){
                    al[s.charAt(j)]++;
                    curLength++;
                }
                else {
                    break;
                }

            }
            maxLength = Math.max(curLength, maxLength);


        }
        return maxLength;

    }
}