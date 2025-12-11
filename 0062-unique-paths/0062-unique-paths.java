class Solution {
    public int uniquePaths(int m, int n) {
        int cnt = 0;
        int [][] dp = new int [m+1][n+1];
        dp[m-1][n]=1;
        for(int i = m-1 ; i >= 0 ; i-- ){
            for(int j = n-1 ; j >= 0 ; j-- ){
                dp[i][j] = dp[i+1][j]+dp[i][j+1];
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
        return dp[0][0];
        // return helper(0,0,m,n,cnt);
        
    }
    public int helper(int i,int j,int m,int n,int cnt){
        if(i==m-1&&j==n-1)return cnt+1;
        if(i >= m || j >= n )return cnt;

    
        // for(int r = i ; r < m ; r++ ){
        //     for(int p = j ; p < n ; p++){
        //         System.out.println();
        return helper(i,j+1, m,n, cnt)+helper(i+1,j, m,n, cnt);
        //     }
        // }
        // return cnt;
    }
}