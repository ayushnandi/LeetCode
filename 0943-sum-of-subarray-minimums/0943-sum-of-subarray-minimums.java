class Solution {
    private int[] psee(int[] arr){
        int[] pse = new int[arr.length];
        Stack<Integer> st = new Stack<Integer>();

        for(int i = 0; i < arr.length; i++){
            while(!st.isEmpty() && arr[st.peek()] > arr[i]){
                st.pop();
            }
            pse[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }

        return pse;
    }


    private int[] nse(int[] arr){
        int[] nse = new int[arr.length];
        Stack<Integer> st = new Stack<Integer>();

        for(int i = arr.length-1; i >= 0; i--){
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]){
                st.pop();
            }
            nse[i] = st.isEmpty() ? arr.length : st.peek();
            st.push(i);
        }
        return nse;
    }
    public int sumSubarrayMins(int[] arr) {
        long mod = (long)(1e9+7);
        long sum = 0L;

        int[] left = psee(arr);
        int[] right = nse(arr);

        for(int i = 0; i < arr.length; i++){
            long leftNu = i - left[i];
            long rightNu = right[i] - i;

            sum = (sum + (leftNu * rightNu * arr[i]) % mod) % mod;
        }

        return (int)sum;
    }
}