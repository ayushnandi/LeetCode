class Solution {
    public int prefixCount(String[] words, String pref) {
        int cnt = 0 ;
        for(String wrd : words){
            if(wrd.startsWith(pref)) {
                cnt++;
            }
        }
        return cnt;
    }
}