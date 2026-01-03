class Solution {
    public int divide(int dividend, int divisor) {
        long remainder = (long)dividend / divisor;
        if (remainder > Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }
        else if (remainder < Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }
        return (int)remainder;
    }
}