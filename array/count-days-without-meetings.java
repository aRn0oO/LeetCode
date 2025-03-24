class Solution {
    public int countDays(int days, int[][] meetings) {
        Arrays.sort(meetings, Comparator.comparingInt(a->a[0]));
        
        ArrayList<int[]> list = new ArrayList<>();

        for(int[]meeting: meetings){
            if(list.isEmpty()|| meeting[0]> list.get(list.size()-1)[1]) list.add(meeting);
            else{
                list.get(list.size()-1)[1] = Math.max(list.get (list.size()-1)[1],meeting[1]);
            }
        }
        int meetingDaysCount = 0;
        for (int[] m : list) {
            meetingDaysCount += (m[1] - m[0] + 1);
        }

        return days - meetingDaysCount;

    }
}