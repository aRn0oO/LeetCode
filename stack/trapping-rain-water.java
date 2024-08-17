class Solution {
    public int trap(int[] height) {
        
        int n = height.length, total = 0;
        int lm =0 , rm = 0 , l = 0, r = n-1;
        while(l<r ){
            lm=Math.max(lm,height[l]);
            rm = Math.max(rm, height[r]);
            if(lm < rm){
                total+= (lm - height[l]);
                l++;
            }else{
                total +=(rm-height[r]);
                r--;
            }
        }
        return total;
    }
}