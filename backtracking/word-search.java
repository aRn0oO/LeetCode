class Solution {
    public boolean exist(char[][] board, String word) {
        char[] words = word.toCharArray();

        for(int i = 0; i < board.length; i++){
            for(int j = 0; j<board[0].length;j++){
                if (exist(board, words, i, j , 0)) return true;
            }
        }
        return false;
    }

    private boolean exist(char[][] board, char [] words, int i , int j, int index){
        if(index == words.length ) return true;
        if( i>board.length-1|| i<0|| j < 0 || j >board[0].length-1|| board[i][j]!= words[index]) return false;
        board[i][j]= '*';
        boolean res = exist(board, words, i+1, j, index+1) ||exist(board, words, i-1, j, index+1) ||exist(board, words, i, j+1, index+1) ||exist(board, words, i, j-1, index+1);
        return res;
    }
}