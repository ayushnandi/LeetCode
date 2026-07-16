class Solution {
    public int[] getSubarrayBeauty(int[] nums, int k, int x) {
        int arr [] = new int [nums.length -k +1];
        int t [] = new int [101] ;
        for(int i = 0 ; i < k ; i++){
            t[nums[i]+50]++;
        }
        for(int i = 0 ; i <= nums.length-k ; i++ ){
            int cnt =0 , val =-1;
            for(int j = 0 ; j < 50 ; j++){
                if(t[j]>0){
                    cnt+=t[j];
                    if(cnt>=x){
                        val = j;
                        break;
                    }
                }
            }
            t[nums[i]+50]--;
            if(i<nums.length-k){
                t[nums[i+k]+50]++;
            }
            arr[i]=val==-1?0:val-50;
        }
        return arr;
    }
}
