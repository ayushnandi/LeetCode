class Solution {
    public char kthCharacter(int k) {
        int s = Integer.bitCount(k-1);
        return (char)('a'+s) ;
    }
}