class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for(int i = 0 ; i <= n/2; i++){
            int l = n-1;
            for (int j = i; j < l - i; j++) {
            int temp = matrix[i][j];
            matrix[i][j] = matrix[l - j][i];
            matrix[l - j][i] = matrix[l - i][l - j];
            matrix[l - i][l - j] = matrix[j][l - i];
            matrix[j][l - i] = temp;
            }
        }
        for(int i = 0 ; i < n; i++){
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}