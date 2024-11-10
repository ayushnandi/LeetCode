class Solution {
    public int minimumSubarrayLength(int[] nums, int targetOR) {
        int[] bitCount = new int[32];
        int leftIndex = 0;
        int minLength = Integer.MAX_VALUE;
        for (int rightIndex = 0; rightIndex < nums.length; rightIndex++) {
            for (int bit = 0; bit < 32; bit++) {
                bitCount[bit] += (nums[rightIndex] >> bit) & 1;
            }
            while (leftIndex <= rightIndex && computeBitwiseOR(bitCount) >= targetOR) {
                minLength = Math.min(minLength, rightIndex - leftIndex + 1);
                for (int bit = 0; bit < 32; bit++) {
                    bitCount[bit] -= (nums[leftIndex] >> bit) & 1;
                }
                leftIndex++;
            }
        }
        return minLength == Integer.MAX_VALUE ? -1 : minLength;
    }
    private int computeBitwiseOR(int[] bitCount) {
        int resultOR = 0;
        for (int bit = 0; bit < 32; bit++) {
            if (bitCount[bit] != 0) {
                resultOR ^= 1 << bit;
            }
        }
        return resultOR;
    }
}