class Solution {
    public int maxArea(int[] height) {
        int l = 0, r = height.length-1;
        int v = 0;

        while(l<r){
            v = Math.max(Math.min(height[l],height[r])*(r-l), v);

            if(height[l]<height[r]) l++;
            else r--;
        }

        return v;
    }
}