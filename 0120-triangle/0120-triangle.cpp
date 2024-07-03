class Solution {
public:
    int minimumTotal(vector<vector<int>>& triangle) {
        int n = triangle.size();
        std::vector<std::vector<int>> dp(n, std::vector<int>(triangle[n-1].size(), 0));
        
        dp[0][0] = triangle[0][0];
        
        // Fill the first column of the dp array
        for (int i = 1; i < n; i++) {
            dp[i][0] = triangle[i][0] + dp[i-1][0];
        }
        
        // Fill the rest of the dp array
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < triangle[i].size(); j++) {
                if (j < triangle[i].size() - 1) {
                    dp[i][j] = triangle[i][j] + std::min(dp[i-1][j-1], dp[i-1][j]);
                } else {
                    dp[i][j] = triangle[i][j] + dp[i-1][j-1];
                }
            }
        }
        
        // Find the minimum path sum in the last row
        int minPathSum = INT_MAX;
        for (int i = 0; i < triangle[n-1].size(); i++) {
            minPathSum = std::min(minPathSum, dp[n-1][i]);
        }
        
        return minPathSum;
    }
};