class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
        int n = s.length();
        int []shiftList = new int [n+1];
        for(int[] shift: shifts){
            int start = shift[0], end = shift[1], dir = shift[2]==1?1:-1;
            shiftList[start] += dir;
            if(end+1< n) shiftList[end+1] -= dir;
        }

        int currentShift = 0;
        for (int i = 0; i < n; ++i) {
            currentShift += shiftList[i];
            shiftList[i] = currentShift;
        }

        StringBuilder sb = new StringBuilder(s);
        for(int i = 0; i < n; i++){
            int netShift = (shiftList[i]%26 +26)%26;
            sb.setCharAt(i , (char)('a'+(s.charAt(i)-'a'+netShift)%26));
        }
        return sb.toString();
    }
}   