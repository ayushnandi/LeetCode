class Solution {
    public void moveZeroes(int[] nums) {
        int temp = 0;
        for(int i = 0 , j = 1 ; j < nums.length ; j++ ){
            if(nums[i]==0 && nums[j]!=0){
                temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
            else if(nums[i]!=0){
                i++;
            }
        }
    }
}