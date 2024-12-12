class Solution {
    public int numOfStrings(String[] a, String word) {
        int count = 0 ;
        for(String s : a)if(word.contains(s))count++;
        return count;
    }
}