class Solution {
    public int countDays(int days, int[][] meetings) {
        int[] day = new int[days+1];
        for(int []meeting : meetings){
            for (int i = meeting[0]; i<=meeting[1];i++){
                day[i]+= 1;
            }
        }
        int res = 0;
        for(int i: day){
            if(i==0) res++;
        }
        return res-1;
    }
}