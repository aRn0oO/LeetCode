class Solution {
    public int reverse(int x) {
        if(x< 0) return -1*reverse(-1*x);
        int reverse = 0;
        while(x>0){
            if(reverse!= 1) reverse*=10;
            reverse+= (x%10);
            
            x/=10;
            
            
        }
        return reverse;
    }
}