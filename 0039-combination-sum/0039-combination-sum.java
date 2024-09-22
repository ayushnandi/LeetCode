class Solution {
    List<List<Integer>> arr = new ArrayList<List<Integer>>();
    public List<List<Integer>> combinationSum(int[] A, int target) {
        Arrays.sort(A);
        int n =  A.length ;
        List<Integer> arr2 = new ArrayList<Integer>();
        helper(A, target, n, 0, arr2);
        return arr;
    }
    public void helper(int[] A, int t, int n , int i,List<Integer> arr2){
        if(i==n){
            if(t==0){
                arr.add(new ArrayList<>(arr2));
            }
            return;
        }
        if(t>=A[i]){
            arr2.add(A[i]);
            helper(A,t-A[i],n,i,arr2);
            arr2.remove(arr2.size()-1);
        }
        helper(A,t,n,i+1,arr2);
    } 
}