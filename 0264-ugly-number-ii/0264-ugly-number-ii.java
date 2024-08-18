class Solution {
    public int nthUglyNumber(int n) {
        int[] nums = new int[n];
        nums[0] = 1;
        int i2 = 0, i3 = 0, i5 = 0;
        for (int i = 1; i < n; i++) {
            int nextNum = Math.min(nums[i2] * 2, Math.min(nums[i3] * 3, nums[i5] * 5));
            nums[i] = nextNum;
            if (nextNum == nums[i2] * 2) i2++;
            if (nextNum == nums[i3] * 3) i3++;
            if (nextNum == nums[i5] * 5) i5++;
        }
        return nums[n - 1];
    }
}