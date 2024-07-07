class Solution {
    public int numWaterBottles(int b, int n) {
        int store = 0;
        int left = 0;
        while(b>0){
            store += b;
            int f = (b+left)/n;
            left = (b+left)%n;
            b = f;
            System.out.println("Store = "+store+" left = "+left+" bottel = "+b);
        }
        System.out.println(store);
        return store;
    }
}