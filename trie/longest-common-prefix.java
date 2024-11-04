class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder ans = new StringBuilder();
        String first= strs[0];
        String last = strs[strs.length-1];
        Arrays.sort(strs);
        for(int i = 0; i < Math.min(first.length(), last.length());i++){
            if(first.charAt(i)!=last.charAt(i)){
                return ans.toString();
            }
            ans.append(first.charAt(i));
        }

        return ans.toString();
    }
}