class Solution {
    public int coinChange(int[] coins, int x) {
        int [] dp = new int [x+1];
        Arrays.fill(dp,x+1);
        dp[0] = 0;
        for(int i = 1 ; i <= x ; i++ ){
            for(int j = 0 ; j < coins.length ; j++ ){
                if(coins[j]<=i){
                    dp[i] = Math.min(dp[i],dp[i-coins[j]]+1);
                }
            }
        }
        return dp[x] < x+1 ? dp[x] : -1;
    }
}