class Solution {
    public int divide(int a, int b) {
        if(a== 0)return 0;
        if(a<0 && b< 0) return divide(-1*a, -1*b);
        else if(a< 0&& b> 0) return -1*divide(-1*a, b);
        else if(a> 0 && b< 0) return -1* divide(a,-1*b);


        return helper(a,b);
    }

    int helper(int a, int b){
        if(a<b) return 0;
        return helper(a-b,b)+1;

    }
}