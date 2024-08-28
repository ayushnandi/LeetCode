class Solution {
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        int n = grid1.length;
        int m = grid1[0].length;
        boolean[][] path = new boolean[n][m];
        int ans = 0;
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                if(!path[i][j] && grid1[i][j] == 1 && grid2[i][j] == 1 && helper(grid1,grid2,i,j,path)) {
                    ans++;
                }
            }
        }
        return ans;
    }
    
    
    boolean helper(int[][] grid1, int[][] grid2, int row, int col, boolean[][] path) {
        if(row<0 || col<0 || row>=grid1.length || col>= grid1[0].length || path[row][col] || grid2[row][col]!=1) return true;
        if(grid1[row][col]!=1)
            return false;
        path[row][col] = true;
        boolean ans = true;
        ans = ans & helper(grid1,grid2,row-1,col,path);
        ans = ans & helper(grid1,grid2,row+1,col,path);
		ans = ans & helper(grid1,grid2,row,col-1,path);
        ans = ans & helper(grid1,grid2,row,col+1,path);
        return ans;
    }
}