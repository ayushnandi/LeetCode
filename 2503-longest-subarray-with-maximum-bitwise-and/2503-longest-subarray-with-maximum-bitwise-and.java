class Solution {
    public int longestSubarray(int[] nums) {
        int max = Integer.MIN_VALUE;
        for(int i : nums ){
            max = Math.max(i,max);
        }
        int count = 0 ;
        int ans = Integer.MIN_VALUE;
        for(int  i : nums){
            if(i==max){
                count++;
            }
            else{
                count=0;
            }
            ans = Math.max(count,ans);
        }
        return ans;
    }
}