class Solution {
    public int[] twoSum(int[] nums, int t) {
        // List<Integer> list = new ArrayList<>();
        
        int n=nums.length;
        for(int i = 0 ; i < n ; i++ ){
            for(int j = i+1 ; j< n ; j ++){
                if(nums[i]+nums[j]==t ){
                    return new int [] {i,j};
                }
            }
        }
        return null;

    }
}