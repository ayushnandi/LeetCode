class Solution {
    public int rob(int[] nums) {
        int dp []  = new int [nums.length+1];
        int dp2 [] = new int [nums.length+1];
        Arrays.fill(dp,-1);
        Arrays.fill(dp2,-1);
        return Math.max(helper(nums,0,dp,0,nums.length-1),helper(nums,1,dp2,0,nums.length));
    }
    public int helper(int [] nums,int i,int [] dp,int p, int n){
        if(i==n-1)return nums[i];
        if(i>=n)return 0;
        if(dp[i]!=-1) return dp[i];
        int o1 = helper(nums,i+2,dp,p,n)+nums[i];
        int o2 = helper(nums,i+1,dp,p,n);
        dp[i]=Math.max(o2,o1);
        return dp[i];

    }
}