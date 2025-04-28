class Solution {
    public long countSubarrays(int[] nums, long k) {
        long ans = 0;
        long sum = 0;
        int start = 0;
        int n = nums.length;

        for (int end = 0; end < n; end++) {
            sum += nums[end];
            while (sum * (end - start + 1) >= k) {
                sum -= nums[start];
                start++;
            }
            ans += (end - start + 1);
        }
        return ans;
    }
}