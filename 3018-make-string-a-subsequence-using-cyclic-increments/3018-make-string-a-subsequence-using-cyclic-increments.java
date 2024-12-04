class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
        int j = 0; // Pointer for str2
        if (str1.length() < str2.length())
            return false; // Impossible if str1 is shorter than str2

        for (int i = 0; i < str1.length(); i++) {
            if (j >= str2.length()) {
                return true; // All characters of str2 matched
            }
            char ch1 = str1.charAt(i);
            char ch2 = str2.charAt(j);
            // Check direct match or match after cyclic increment
            if (ch1 == ch2 || (ch1 + 1 - 'a') % 26 == ch2 - 'a') {
                j++; // Move to the next character in str2
            }
        }
        return j >= str2.length(); // True if all of str2 is matched
    }
}