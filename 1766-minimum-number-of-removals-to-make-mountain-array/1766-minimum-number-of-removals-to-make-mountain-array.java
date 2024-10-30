
class Solution {
    public int minimumMountainRemovals(int[] nums) {
        int[] lis = getLIS(nums);
        reverse(nums);
        int[] lds = getLIS(nums);
        reverse(lds);
		int lbsLength=0;
        for(int i=0;i<nums.length;i++){
            if(lis[i]!=1 && lds[i]!=1)
            lbsLength=Math.max(lbsLength,lis[i]+lds[i]-1);
        }
        return nums.length - lbsLength;
    }
    
    private void reverse(int[]nums){
        for(int i=0,j=nums.length-1;i<j;i++,j--){
            int tmp = nums[i];
            nums[i]=nums[j];
            nums[j]=tmp;
        }
    }
    
    private int[] getLIS(int[]nums){
        int[] lis = new int[nums.length];
        lis[0]=1;
        for(int i=0;i<lis.length;i++){
            int j=0, max=1;
            while(j<i){
                if(nums[j]<nums[i]) max = Math.max(1+lis[j],max);
                j++;
            }
            lis[i]=max;
        }
        return lis;
    }
}