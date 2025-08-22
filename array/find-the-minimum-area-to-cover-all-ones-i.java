class Solution {
    public int minimumArea(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int lm = n, rm = 0, um= m, dm = 0;


        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] ==1) {
                    lm = Math.min(lm, i);
                    rm = Math.max(rm, i);
                    um = Math.min(um, j);
                    dm = Math.max(dm, j);
                }
            }
        }
        return (rm-lm+1)*(dm - um +1);
    }
}