class Solution {
    public int[] arrayChange(int[] nums, int[][] arr) {
        HashMap <Integer, Integer> map = new HashMap<>();
        // for(int i = 0 ; i < arr.length ; i++ ){
        //     map.put(arr[i][0],arr[i][1]);
        // }
        // // System.out.println();
        // for(int i = 0 ; i< nums.length ; i++ ){
        //     if(map.containsKey(nums[i])){
        //         nums[i]= map.get(nums[i]);
        //     }
        // }

        // int j = 0;
        // for(int i = 0 ; i < arr.length;){
        //     if(arr[i][0]==nums[j]){
        //         nums[j]= arr[i][1];
        //         i++;
        //     }
        //     j++;
        //     // System.out.println(i);
        //     if(j >= nums.length){
        //         j = 0;
        //     }
        // }

        for(int i = 0 ; i < nums.length ; i++ ){
            map.put(nums[i],i);
        }
        for(int i = 0 ; i < arr.length; i++){
            if(map.containsKey(arr[i][0])){
                nums[map.get(arr[i][0])]= arr[i][1];
                map.put(arr[i][1],map.get(arr[i][0]));
            }
        }
        return nums;
    }
}