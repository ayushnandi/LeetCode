class Solution {
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        int [][] path = new int [m][n];
        for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            if (helper(board, word, i, j, 0, path))
                return true;
            }
        }
        return false;
    }
    public boolean helper(char[][] board, String word, int i, int j, int n, int[][] path){
        if(word.length() == n){
            return true;
        }
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || path[i][j] == 1 || board[i][j] != word.charAt(n)){
            return false;
        }
        path[i][j] = 1;
        if( helper(board, word, i + 1, j, n + 1, path) || helper(board, word, i - 1, j, n + 1, path) || helper(board, word, i, j + 1, n + 1, path) || helper(board, word, i, j - 1, n + 1, path) ){
            path[i][j] = 0;
            return true;
        }
        path[i][j] = 0;
        return false;
    }
}