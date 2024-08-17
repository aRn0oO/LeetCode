class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a,b)-> a[0]==b[0]?b[1]-a[1]:a[0]-b[0]);
        int index = 0, cnt =1;
        for(int i = 1; i < intervals.length;i ++){
            if(intervals[i][1]> intervals[index][1]){
                cnt++;
                index = i;
            }
        }
        return cnt;
    }
}