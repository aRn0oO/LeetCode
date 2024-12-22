class Solution {
    public double myPow(double x, int n) {
        if(n<0){
            x = 1/x;
            n= -n;

        }else if(n ==0) return 1.0;
        double res = 1.0;
        for(int i=0; i <n; i++){
            res*=x;
        }
        return res;
    }
}