class Solution {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        int[][] mat=new int[m][n];
        for(int[] d:walls){
            mat[d[0]][d[1]]=1;
        }
        for(int[] d:guards){
            mat[d[0]][d[1]]=2;
        }
        for(int[] d:guards){
            bfs(mat,d[0],d[1]);
        }
        int cnt=0;
        for(int[] d:mat){
            for(int num:d){
                if(num==0)cnt++;
            }
        }
        return cnt;
    }
    int[][] dir=new int[][]{{1,0},{-1,0},{0,1},{0,-1}};
    public void bfs(int[][] mat,int i,int j){
        mat[i][j]=2;
        for(int k=0;k<4;k++){
            int r=i,c=j;
            
            while(r+dir[k][0]>=0 && r+dir[k][0]<mat.length && c+dir[k][1]>=0 && c+dir[k][1]<mat[0].length && mat[r+dir[k][0]][c+dir[k][1]]!=1 && mat[r+dir[k][0]][c+dir[k][1]]!=2){
                r+=dir[k][0];
                c+=dir[k][1];
                mat[r][c]=-1;
            }
        }
    }
}