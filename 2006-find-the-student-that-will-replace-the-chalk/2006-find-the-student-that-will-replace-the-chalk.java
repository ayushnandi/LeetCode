class Solution {
    public int chalkReplacer(int[] arr, int k) {
        int n = 0;
        int count = 0;
        while(k>0){
            if(arr.length==n) n = 0;
            k-=arr[n++];
        }
        return k==0? (n%arr.length): n-1;
    }
}