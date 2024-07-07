class Solution {
    public String getEncryptedString(String s, int k) {
        char[] charArray = s.toCharArray();

        // Perform the swaps
        k = k%s.length();
        System.out.print(k);
        
        swap(charArray, k, s.length()-1);
        swap(charArray, 0, k-1 );
        swap(charArray, 0, s.length()-1);
        
        // Convert the char array back to a string and return it
        // System.out.print(new String(charArray));
        return new String(charArray);
    }

    private void swap(char[] charArray, int i, int j) {
        while (i < j) {
            char temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;
            i++;
            j--;
        }
    }
}