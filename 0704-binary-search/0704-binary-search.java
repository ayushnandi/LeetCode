class Solution {
    public int search(int[] nums, int t) {
        int s = 0;
        int e = nums.length-1;
        int m = 0;
        if(nums[0]==t) return 0;
        while(s<=e){
            m = (s+e)/2;
            // System.out.print(m);
            if(nums[m]==t)return m;
            if(nums[m]<t)s=m+1;
            else e=m-1;
            // System.out.println(" "+m);
        }
        return -1;
    }
}