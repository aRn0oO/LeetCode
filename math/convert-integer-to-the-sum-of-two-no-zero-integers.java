class Solution {
    public int[] getNoZeroIntegers(int n) {
        if(n%10==1)return new int[]{2,n-2};
        else return new int[]{1,n-1};
    }
}