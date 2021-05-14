public boolean evenRow(int[][] mat, int row){
       for(int i = 0; i < mat[row].length; i++){
        if(mat[row][i] % 2 != 0){
        return false;
        }
        }
        return true;
   }
