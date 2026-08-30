class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int left [] = new int [n];
        int ans [] = new int [n];
        int p = 1;
        left[0] = p;
        for(int i = 1 ; i < n ; i++ ){
            left[i]  = nums[i-1]*left[i-1];
        }
        for(int i = n-1 ; i >= 0 ; i-- ){
            ans[i] = left[i]*p;
            p *= nums[i];
        }
        // for(int i : left)System.out.println(i);
        // ans[0] = p;
        return ans;
    }
}