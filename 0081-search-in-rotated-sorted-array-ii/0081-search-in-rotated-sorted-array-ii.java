class Solution {
    public boolean search(int[] nums, int t) {
        int n = nums.length;
        for(int i = 0 ; i<n ; i++){
            if(nums[i]==t)return true;
            // if(nums[(i+t)%n]>nums[(i+t+1)%n])return false;
            // System.out.println(nums[(i+t)%n]+" "+nums[(i+t+1)%n]);
        }
        return false;
    }
}