class Solution {
    public int trap(int[] height) {
        int l = 0, r = height.length-1,lm = 0, rm = 0;
        int res= 0;

        while(l < r){
            lm = Math.max(lm, height[l]);
            rm = Math.max(rm, height[r]);


            if(lm > rm){
                res += (rm-height[r]);
                r--;
            }else {
                res+= (lm-height[l]);
                l++;
            }
        }

        return res;


        

    }
}