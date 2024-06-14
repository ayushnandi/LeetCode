class Solution {
    public int minIncrementForUnique(int[] nums) {



        Arrays.sort(nums);
        int count = 0;
        for(int i  = 1 ; i < nums.length ; i++ ){
            while(nums[i-1]>=nums[i]){
                count++ ;
                nums[i]++ ;            
            }
        }
        return count;




        // HashMap<Integer,Integer> map = new HashMap<>();
        // for(int i : nums){
        //     map.put(i,map.getOrDefault(i,0)+1);
        // }
        // int n =0 ;
        // int count = 0 ;
        // for(int i = 1; i < nums.length;i++){
        //     if(nums[i-1]<nums[i]){
        //         n = nums[i];
        //         while(nums[i-1] > n || map.containsKey(n)){
        //             count++;
        //             n += 1;
        //         }
        //     }
        // }
        // return count;
    }
}