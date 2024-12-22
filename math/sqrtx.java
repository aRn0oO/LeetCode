class Solution {
    public int mySqrt(int x) {
        if(x== 0|| x==1) return x;
        int r = x/2, l = 0;
        while(l< r){
            int mid = l+(r-l)/2;
            if(mid*mid == x) return mid;
            else if ((long) mid*mid > (long)x) r = mid -1;
            else l = mid +1;
        }
        return l;
    }
}