class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)return false;
        if(x<10)return true;
        String s = Integer.toString(x);
        for(int i = (s.length()/2)-1 ; i < s.length() ; i++){
            if(s.charAt(i)!=s.charAt(s.length()-i-1)){
                return false;
            }
        }
        return true;
    }
}