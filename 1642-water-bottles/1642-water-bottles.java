class Solution {
    public int numWaterBottles(int b, int n) {
        int store = 0;
        int left = 0;
        int f = 0;
         while (b > 0) {
            store += b;
            int newBottles = (b + left) / n;
            left = (b + left) % n;
            b = newBottles;
        }
        store += b;
        System.out.println(store);
        return store;
    }
}