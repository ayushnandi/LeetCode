class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
        int j = 0;
        int cnt = 0;
        if (str1.length() < str2.length()) return false;

        for (int i = 0; i < str1.length(); i++) {
            // System.out.print(str1.charAt(i)+" ");
            // System.out.println((str1.charAt(i) - 'a') % 26 );
            if (j >= str2.length()) {
                // System.out.print("Done");
                return true;
            }
            if (str1.charAt(i) == str2.charAt(j)) {
                // System.out.println(str1.charAt(i)+" j++ ");
                j++;
            }
            else if ((str1.charAt(i) + 1 - 'a') % 26 == str2.charAt(j) - 'a'){
                // System.out.println(str2.charAt(j)+" j++ ");
                j++;
            }
            // System.out.println(i+" ");
        }
        if (j >= str2.length()){
            // System.out.print("finish");
            return true;
        }
        // System.out.print("Unfinish");
        return false;
    }
}