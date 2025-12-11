class Solution {
    public int rob(int[] nums) {

        int dp []  = new int [nums.length+1];
        Arrays.fill(dp,-1);
        return helper(nums,0,dp);

    }
    public int helper(int [] nums,int i,int [] dp){
        int n = nums.length;
        if(i==n-1)return nums[i];
        if(i>=n)return 0;
        if(dp[i]!=-1) return dp[i];
        int o1 = helper(nums,i+2,dp)+nums[i];
        int o2 = helper(nums,i+1,dp);
        dp[i]=Math.max(o2,o1);
        return dp[i];

    }
}