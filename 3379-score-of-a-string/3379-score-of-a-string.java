class Solution {
    public int scoreOfString(String s) {
        int count = 0 ;
        for(int i = 0 ; i < s.length()-1 ; i++ ){
            int n = (s.charAt(i) - s.charAt(i+1));
            if(n<0){ 
                count += (n*-1);
            }
            else{ 
                count += n;
            }
        }
        return count;
    }
}