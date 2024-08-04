class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        ArrayList<Integer> arr = new ArrayList<>();
        int [] dp = new int [nums.length];
        for(int i = 0; i < nums.length ; i++ ){
            for(int j = i ; j < nums.length ; j++ ){
                if(j == i){
                    dp[i]=nums[i];
                }
                else{
                    dp[j]=dp[j-1]+nums[j];
                }
                arr.add(dp[j]);
            }
        }
        Collections.sort(arr);
        int sum = 0;
        while(left<=right){
            sum = (sum + arr.get(left-1)) % 1000000007;
            left++;
        }
        return sum ;
    }
}