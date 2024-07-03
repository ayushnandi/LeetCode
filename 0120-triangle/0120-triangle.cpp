class Solution {
public:
    int minimumTotal(vector<vector<int>>& triangle) {
        int n = triangle.size();
        std::vector<int> dp = triangle[n-1];  // Start with the last row
        
        // Start from the second last row and move upwards
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j < triangle[i].size(); j++) {
                dp[j] = triangle[i][j] + std::min(dp[j], dp[j+1]);
            }
        }
        
        // The top element now contains the minimum path sum
        return dp[0];
    }
};