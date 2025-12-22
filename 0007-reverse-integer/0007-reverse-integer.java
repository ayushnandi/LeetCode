class Solution {

    public int reverse(int x) {
        return rev(x, 0);
    }
    
    private int rev(int x, int res) {
        if (x == 0) return res;
        if (res > Integer.MAX_VALUE / 10 || res < Integer.MIN_VALUE / 10) return 0;
        return rev(x / 10, res * 10 + x % 10);
    }
    
}