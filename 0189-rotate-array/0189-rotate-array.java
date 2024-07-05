class Solution {
    public void rotate(int[] arr, int k) {
        k = k % arr.length;
        swap(arr,0,arr.length-1);
        swap(arr,0,k-1);
        swap(arr,k,arr.length-1);     
    }
    public void swap(int [] arr , int s , int e){
        while (s < e) {
        int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }
}