class Solution {
    public int minSubarray(int[] nums, int p) {
        int n=nums.length;
        int totalSum=0;
        for(int num:nums){
            totalSum=(totalSum+num)%p;
        }
        int target=totalSum%p;
        if(target==0){
            return 0;
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,-1); //if target is impossible
        int currSum=0;
        int minLen=n;
        for(int i=0;i<n;i++){
            currSum=(currSum+nums[i])%p;
            int needed=(currSum-target+p)%p;//+p for -ve condition

            if(map.containsKey(needed)){
                minLen=Math.min(minLen,i-map.get(needed));
            }
            map.put(currSum,i);
        }
    return minLen==n?-1:minLen;
    }
}