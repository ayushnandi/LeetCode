class Solution {
    public int scoreOfParentheses(String s) {
        int cnt = 0;
        int max = 0;
        Stack <Integer> stk = new Stack<>();
        for(char c : s.toCharArray() ){
            if(c == '('){
                stk.add(0);
            }
            else{
                int n = 0;
                while(stk.peek()!=0){
                    n += stk.pop();
                }
                stk.pop();
                stk.add(Math.max(n*2,1));
            }
        }
        int ans = 0;
        while(!stk.empty()){
            ans+=stk.pop();
        }
        return ans;
    }
}