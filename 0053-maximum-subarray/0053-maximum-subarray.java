class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0 ;
        int maxSum = Integer.MIN_VALUE ;
        int s = 0 ;
        for(int  i = 0 ; i < nums.length ; i++ ){
            if(sum < 0 )s=i;
            sum += nums[i];
            if(sum>maxSum){
                maxSum=sum;
            }
            if(sum<0)sum = 0;
        }
        return maxSum;
    }
}