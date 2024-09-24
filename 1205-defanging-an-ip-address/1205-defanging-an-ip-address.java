class Solution {
    public String defangIPaddr(String s) {
        String r = "[.]";
        String m = "";
        for(int i = 0 ; i < s.length() ; i++ ){
            if(s.charAt(i)=='.'){
                m += r;
            }
            else{
                m += s.charAt(i);
            }
        }
        return m;
    }
}