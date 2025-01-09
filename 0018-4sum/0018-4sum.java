class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        HashSet<List<Integer>> set = new HashSet<>();
        for(int i = 0; i < n-3; i++) {
           for(int j = i+1; j < n-2; j++) {
            int k = j+1;
            int l = n - 1;
            
            while(k < l) {
                long sum = (long)nums[i] + (long)nums[j] + (long)nums[k] + (long)nums[l];
                if(sum == target) {
                    ArrayList<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    list.add(nums[l]);
                    set.add(list);
                    k++;
                    l--;
                }
                else if(sum < target) {
                    k++;
                } else {
                    l--;
                }
            }
        }
        }
        return new ArrayList<>(set);
    }
}