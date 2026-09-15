class Solution {
    public int maxPalindromes(String s, int k) {
        int n = s.length();
        int[] dp = new int[n+1];
        boolean[][] isPal = new boolean[n][n];
        for(int len = 1 ; len <= n ; len++) {
            for(int i = 0 ; i +len - 1 < n ; i++) {
                int j = i+len-1;
                if(len == 1) isPal[i][j] = true;
                else if(len == 2) {
                    isPal[i][j] = (s.charAt(i) == s.charAt(j));
                }else {
                    isPal[i][j] = (s.charAt(i)==s.charAt(j)) && isPal[i+1][j-1];
                }
            }
        }
      for (int i = 1; i <= n; i++) {
            dp[i] = dp[i - 1]; 
            for (int l = i - k; l >= 0; l--) {
                if (isPal[l][i - 1]) {
                    dp[i] = Math.max(dp[i], dp[l] + 1);
                }
            }
        }
        return dp[n];
    }
}