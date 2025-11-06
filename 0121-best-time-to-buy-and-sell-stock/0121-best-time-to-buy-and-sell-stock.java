class Solution {
    public int maxProfit(int[] arr) {
        int profit = 0 ;
        int min = Integer.MAX_VALUE;
        for(int i = 0 ; i < arr.length ; i++ ){
            min = Math.min(min, arr[i]);
            profit = arr[i]-min>profit?arr[i]-min:profit;
        }
        return profit;
    }
}