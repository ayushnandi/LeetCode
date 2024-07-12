class Solution {
    public int maximumGain(String s, int x, int y) {
        Stack<Character> stk = new Stack<>();
        int sum = 0 ;
        stk.add('x');
        if(x>=y){
            for(int i = 0 ; i < s.length() ; i++ ){
                char curr = s.charAt(i);
                if(stk.peek()=='a' && curr=='b'){
                    stk.pop();
                    sum += x;
                }
                else{
                    stk.add(curr);
                }
            }
            String str = "";
            for(char c : stk){
                str += c;
            }
            s = str ;
            // System.out.println(s);
            Stack<Character> stk2 = new Stack<>();
            stk2.add('x');
            for(int i = 0 ; i < s.length() ; i++ ){
                char curr = s.charAt(i);
                if(stk2.peek()=='b' && curr=='a'){
                    stk2.pop();
                    sum += y;
                    // System.out.println(sum);
                }
                else{
                    stk2.add(curr);
                }
            }
            System.out.println();
            for(char c : stk2){
                System.out.print(c);
            }
        }
        else{
            for(int i = 0 ; i < s.length() ; i++ ){
                char curr = s.charAt(i);
                if(stk.peek()=='b' && curr=='a'){
                    stk.pop();
                    sum += y;
                }
                else{
                    stk.add(curr);
                }
            }
            String str = "";
            for(char c : stk){
                str += c;
            }
            s = str ;
            // System.out.println(s);
            Stack<Character> stk2 = new Stack<>();
            stk2.add('x');
            for(int i = 0 ; i < s.length() ; i++ ){
                char curr = s.charAt(i);
                if(stk2.peek()=='a' && curr=='b'){
                    stk2.pop();
                    sum += x;
                }
                else{
                    stk2.add(curr);
                }
            }
            // System.out.println();
            // for(char c : stk2){
            //     System.out.print(c);
            // }
        }
        return sum;
    }
}