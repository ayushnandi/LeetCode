class Solution {
    public int passThePillow(int n, int t) {
        int c = t / (n-1);
        return c%2==0?t%(n-1)+1:n-(t%(n-1));
    }
}