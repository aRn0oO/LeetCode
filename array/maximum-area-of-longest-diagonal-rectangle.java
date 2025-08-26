class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
  
        int max = 0, res = 0;

        for(int i = 0; i < dimensions.length; i++ ){
            int l = dimensions[i][0], w = dimensions[i][1];
            if((l*l+w*w)>max) {
                max = l*l+w*w;
                res  = i;
            }

        }

        return dimensions[res][0]*dimensions[res][1];
    }
}