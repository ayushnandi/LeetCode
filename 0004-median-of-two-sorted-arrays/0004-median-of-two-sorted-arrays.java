class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int [] arr = merge(nums1, nums2);
        int n = arr.length ;
        double median = 0.0;
        if (n %2 != 0 ){
            median = (double) (arr[n/2]);
        }
        else{
            median = (double) ((arr[(n/2) -1] + arr[n/2])) / 2;
        }
        return median;
    }
   public int[] merge(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length + nums2.length];
        int n1 = 0;
        int n2 = 0;
        int i = 0;

        while (n1 < nums1.length && n2 < nums2.length) {
            if (nums1[n1] <= nums2[n2]) {
                arr[i++] = nums1[n1++];
            } else {
                arr[i++] = nums2[n2++];
            }
        }
        while (n1 < nums1.length) {
            arr[i++] = nums1[n1++];
        }

        while (n2 < nums2.length) {
            arr[i++] = nums2[n2++];
        }
        return arr;
    }
}