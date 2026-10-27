class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int [] arr = new int [n];
        int p = 1;
        int [] ans = new int [n];
        for(int i = 0 ; i < n  ; i++ ){
            arr[i] = p;
            p *= nums[i];
        }
        int s = 1;
        for(int i = n-1 ; i >= 0 ; i-- ){
            ans[i] = arr[i]*s;
            s *= nums[i];
        }
        return ans;
    }
}