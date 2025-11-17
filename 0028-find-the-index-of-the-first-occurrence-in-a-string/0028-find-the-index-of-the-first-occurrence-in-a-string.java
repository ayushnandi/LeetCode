class Solution {
    public int strStr(String haystack, String needle) {
        int n = needle.length();
        for (int i = 0 ; i < haystack.length()-n+1 ; i++){
            String hay = haystack.substring(i,i+n);
            if ( hay.equals(needle)){
                return i;
            }
        }
        return -1;
    }
}