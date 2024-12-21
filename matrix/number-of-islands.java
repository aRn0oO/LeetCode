class Solution {
    int m, n;

    public int numIslands(char[][] grid) {
        int count = 0;
        m = grid[0].length;
        n = grid.length;

        for(int i = 0; i< n; i++){
            for(int j = 0; j< m; j++){
                if (grid[i][j] == '1'){
                    island(grid,i, j );
                    count++;
                }
            }
        }
        return count;
    }

    void island(char[][]grid, int i, int j){
        if( i<0||j<0||i== n ||j== m||grid[i][j] !='1') return;
        grid[i][j]='0';

        island(grid, i+1, j);
        island(grid, i-1, j);
        island(grid, i , j+1);
        island(grid, i, j-1);
    }
}