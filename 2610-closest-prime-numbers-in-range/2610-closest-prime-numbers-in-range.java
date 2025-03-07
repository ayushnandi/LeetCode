class Solution {
    public int[] closestPrimes(int left, int right) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = left ;  i <= right ; i++ ){
            if(check(i)){
                arr.add(i);
            }
        }
        if(arr.size()<=1 || right-left<=1) return new int [] {-1,-1};
        int [] ans = new int [2] ; 
        int min = Integer.MAX_VALUE;
        for(int i=1  ; i < arr.size() ; i++ ){
            if(min > arr.get(i)-arr.get(i-1)){
                ans[0] = arr.get(i-1);
                ans[1] = arr.get(i);
                min = arr.get(i)-arr.get(i-1);
            }
        }
        return ans;
    }
    public boolean check(int n){
        if (n < 2) return false;
        if (n == 2 || n == 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;

        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }
}