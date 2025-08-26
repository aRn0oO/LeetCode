class Solution {
    public int largestAltitude(int[] gain) {
        int max =0, total = 0;;

        for(int i : gain){
            total+= i;
            max = Math.max(max, total);
        }

        return max;
    }
}