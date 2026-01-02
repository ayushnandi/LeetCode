class Solution {
    public int repeatedNTimes(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n - 2; i++) {
            // Check distance 1, 2, and 3
            if (nums[i] == nums[i + 1] || nums[i] == nums[i + 2]) {
                return nums[i];
            }
        }
        // If not found in the loop, it's the last element (e.g., [1, 2, 3, 1])
        return nums[n - 1];
    }
}