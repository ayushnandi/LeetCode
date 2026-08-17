class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        for(int i = m ; i < n+m ; i++ ){
            
            nums1[i] = nums2[i-m];
            // System.out.println(i-m+"  "+nums1[i]);
        }
        Arrays.sort(nums1);
    }
}