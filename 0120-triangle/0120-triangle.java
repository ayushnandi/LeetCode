class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int [][] dp  = new int  [triangle.size()][triangle.get(triangle.size()-1).size()];
        // for(int  i = 0 ; i< )
        int n = dp.length;
        int m = dp[0].length;
        // System.out.println(n+" "+m);

        dp[0][0] = (triangle.get(0)).get(0);
        // System.out.println(dp[0][0]);
        for(int i = 1 ; i < n ; i++ ){
            dp[i][0] = (triangle.get(i)).get(0) + dp[i-1][0];
            // System.out.println(dp[i][0]);
        }
        for(int i = 1 ; i < dp.length ; i++ ){
            for(int  j = 1 ; j < (triangle.get(i)).size(); j++ ){
                if(j<(triangle.get(i)).size()-1){
                    dp[i][j] = (triangle.get(i)).get(j)+Math.min(dp[i-1][j-1],dp[i-1][j]);
                }
                else{
                    // System.out.println((triangle.get(i)).size());
                    dp[i][j] = (triangle.get(i)).get(j)+dp[i-1][j-1];
                }
            }
        }
        int min = Integer.MAX_VALUE;
        for(int i = 0 ; i < dp.length ; i++ ){
            min  = Math.min(min,dp[n-1][i]);
        }
        return min;
    }
}