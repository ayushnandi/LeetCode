class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
        int j = 0;
        int cnt = 0;
        if (str1.length() < str2.length())
            return false;
        for (int i = 0; i < str1.length(); i++) {
            if (j >= str2.length()) {
                return true;
            }
            if (str1.charAt(i) == str2.charAt(j) || (str1.charAt(i) + 1 - 'a') % 26 == str2.charAt(j) - 'a')
                j++;
        }
        if (j >= str2.length()) {
            return true;
        }
        return false;
    }
}