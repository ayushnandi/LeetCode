class Solution {

    public int reverse(int x) {
        return rev((long)x, 0);
    }
    
    private int rev(long x, long res) {
        if (x == 0) return (int)res;
        if (res > Integer.MAX_VALUE / 10 || res < Integer.MIN_VALUE / 10) return 0;
        return rev(x / 10, res * 10 + x % 10);
    }
    
}