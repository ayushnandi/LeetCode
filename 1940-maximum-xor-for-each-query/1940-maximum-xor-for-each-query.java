class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int n = nums.length;
        int maxVal = (1 << maximumBit) - 1; 
        int xorTotal = 0;
        for (int num : nums) {
            xorTotal ^= num;
        }
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = xorTotal ^ maxVal;
            xorTotal ^= nums[n - 1 - i]; 
        }
        
        return result;
    }
}