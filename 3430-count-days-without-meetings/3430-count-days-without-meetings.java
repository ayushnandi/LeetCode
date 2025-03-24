class Solution {
    public int countDays(int days, int[][] arr) {
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        int cnt = 0 ; 
        int prev = 0 ;
        for(int i = 0 ; i < arr.length ; i++ ){
            int s = arr[i][0];
            int e = arr[i][1];
            if(s > prev +1){
                cnt += s - (prev+1);
            }
            prev = Math.max(prev,e);
        }
        if(prev<days){
            cnt += days - prev;
        }
        return cnt;
    }
}