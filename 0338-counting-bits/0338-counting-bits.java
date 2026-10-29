class Solution {
    public int[] countBits(int n) {
        int ans [] = new int [n+1];

        for(int i = 0 ; i <= n ; i++ ){
            int j = i;
            int cnt  = 0 ; 
            while(j>0){
                cnt += j%2;
                j>>=1;
            }
            ans[i] = cnt;
        }
        return ans;
    }
}