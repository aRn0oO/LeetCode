class Solution {
    int m, n;
    public void solve(char[][] board) {
        if((board.length >=0&&board.length<=2)|| (board[0].length >=0&&board[0].length<=2)) return;
        m = board.length;
        n = board[0].length;
        for(int i= 0; i < n ;i++){
            if(board[0][i]=='O')DFS(board, 0, i);
            if(board[m-1][i]=='O') DFS(board, m-1, i);
        }
        for(int i= 0; i < m ;i++){
            if(board[i][0]=='O')DFS(board, i,0 );
            if(board[i][n-1]=='O') DFS(board, i, n-1);
        }

        for(int i = 0; i<m;i++){
            for(int j = 0; j < m;j++){
                if(board[i][j]=='*'){
                    board[i][j]='O';
                }else if( board[i][j]=='O') board[i][j] = 'X';
            }
        }
    }

    void DFS ( char[][] A, int i, int j){
        if(i<0||j<0||j>=m||i>=n||A[i][j]=='X') return;

        if ( A[i][j]== 'O') A[i][j]= '*';

        DFS(A, i+1, j);
        DFS(A, i-1, j);
        DFS(A, i, j+1);
        DFS(A, i, j-1);
    }
}