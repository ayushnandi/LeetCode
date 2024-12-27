class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int res=Integer.MIN_VALUE;
        int max=values[0];
        int n=values.length;
        for(int i=1;i<n;i++){
            res=Math.max(max+values[i]-i,res);
            if(max < values[i]+i){
                max=values[i]+i;
            }
        }
        return res;
        
    }
}