class Solution {
    public void setZeroes(int[][] A) {
        int row = A.length;
        int col = A[0].length;
        boolean frow = false;
        boolean fcol = false;

        for(int i = 0; i < row; i++){
            if(A[i][0]==0){
                fcol = true;
                break;
            }
        }
        for(int i = 0; i < col; i++){
            if(A[0][i]==0){
                frow = true;
                break;
            }
        }
    
        for(int i = 1; i< row; i++){
            for(int j = 1; j < col; j++){
                if(A[i][j] == 0){
                    A[0][j]= 0;
                    A[i][0]= 0;
                } 
            }
        }
        for (int i = 1; i < row; i++) {
            if (A[i][0] == 0) {
                Arrays.fill(A[i], 0);
            }
        }
        for (int j = 1; j < col; j++) {
            if (A[0][j] == 0) {
                for (int i = 1; i < row; i++) {
                    A[i][j] = 0;
                }
            }
        }
        if (fcol) {
            for (int i = 0; i < row; i++) {
                A[i][0] = 0;
            }
        }
        if (frow) {
            Arrays.fill(A[0], 0);
        }

    }
}