class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length, n = mat[0].length; 
        int route = m*n;
        int[] res  = new int[route];
        int row = 0, col = 0;
        for(int i = 0; i < route; i ++){
            res[i] = mat[row][col];

            if((row+col )% 2 == 0){
                if(col == n - 1) row++;
                else if(row == 0)col ++;
                else{ row--; col++;}
            }else{
                if(row == m - 1)col++;
                else if(col == 0) row ++;
                else{row++;
                col--;}

            }
        }
        return res;
    }
}