class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
  
        int max = 0, maxArea =0;

        for(int i = 0; i < dimensions.length; i++ ){
            int l = dimensions[i][0], w = dimensions[i][1];
            int curr = l*l+w*w;
            if(curr>max||(curr == max && l*w> maxArea)) {
                max = curr;
                maxArea = l*w;
            }

        }

        return maxArea;
    }
}