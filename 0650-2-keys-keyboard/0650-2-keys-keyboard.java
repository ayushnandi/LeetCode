class Solution {
    public int minSteps(int n) {
        int [] dp = new int [n+4];
        if(n==1 || n==0 ) return 0; 
        if(n==2) return 2; 
        dp[1] = 0 ;
        dp[2] = 2 ;
        for(int i = 3 ; i <= n ; i++ ){
            dp[i] = i;
            for(int j = i/2 ; j>=1 ; j-- ){
                if(i%j==0){
                    dp[i] = Math.min(dp[i], dp[j]+(i/j) );
                    break;
                }
            }
        }
        return dp[n];
    }
}