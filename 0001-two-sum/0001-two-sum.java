class Solution {
    public int[] twoSum(int[] nums, int t) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < nums.length ; i++ ){
            for(int j = i+1 ; j< nums.length ; j ++){
                if(nums[i]+nums[j]==t){
                    list.add(i);
                    list.add(j);
                }
            }
        }
        int ans [ ]= new int [list.size()];
        for(int i = 0 ; i< list.size() ; i++ ){
            ans[i]= list.get(i);
        }
        return ans;

    }
}