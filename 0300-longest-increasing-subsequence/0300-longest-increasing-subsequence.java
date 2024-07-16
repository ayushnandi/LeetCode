class Solution {
    public int lengthOfLIS(int[] nums) {
        int [][] arr = new int [nums.length+1][nums.length+1];
        for (int i = 0; i <= nums.length; i++) {
            Arrays.fill(arr[i], -1);
        }
        return helper(nums, arr, -1,0);
    }

    public static int helper(int [] nums, int [][] dp , int prev ,int i){
        if (i == nums.length) {
             return 0;
        }
        if(dp[prev+1][i]!=-1) return dp[prev+1][i];
        int ans1 = Integer.MIN_VALUE;
        int ans2 = Integer.MIN_VALUE;
        if (prev == -1 || nums[prev] < nums[i]) {
            ans1 = 1 + helper(nums, dp, i, i + 1);
        }
        ans2 = helper(nums, dp, prev, i + 1);
        dp[prev+1][i]=Math.max(ans1,ans2);
        return dp[prev+1][i];
    }
}