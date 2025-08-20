class Solution {
    public int countSquares(int[][] A) {
        int row = A.length, col = A[0].length;
        int[][] dp = new int[row+1][col+1];

        int res = 0;

        for( int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(A[i][j] == 1){
                    dp[i+1][j+1] = Math.min(dp[i][j],Math.min(dp[i+1][j],dp[i][j+1]))+1;
                    res += dp[i+1][j+1];
                }  

            }
        }
        return res;
    }
}