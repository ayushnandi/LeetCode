class Solution {
    public int minSwaps(String s) {
        Stack<Integer> stk = new Stack<>();
        int rem = 0;
        for(int i = 0 ; i < s.length() ; i++ ){
            if(s.charAt(i)=='['){
                rem++;
            }
            else{
                if(rem>0) rem--;
            }
        }
        return (rem+1)/2;
    }
}