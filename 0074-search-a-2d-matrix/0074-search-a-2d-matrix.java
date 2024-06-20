class Solution {
    public boolean searchMatrix(int[][] matrix, int t) {
        if(matrix.length==1){
            for(int j = 0 ; j < matrix[0].length;j++ ){
                    if(matrix[0][j]==t){
                        return true;
                    }
                }
            }
        else{
            for(int i = 0 ; i < matrix.length-1 ; i++ ){
                if(matrix[i+1][0]>t){
                    for(int j = 0 ; j < matrix[0].length;j++ ){
                        if(matrix[i][j]==t){
                            return true;
                        }
                    }
                    break;
                }
            }
            for(int j = 0 ; j < matrix[0].length;j++ ){
                    if(matrix[matrix.length-1][j]==t){
                        return true;
                    }
                }
        }
        return false;
    }
}