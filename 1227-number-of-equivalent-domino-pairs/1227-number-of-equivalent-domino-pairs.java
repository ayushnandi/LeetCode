class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        int[] map = new int[100]; 
        int count = 0;

        for (int[] domino : dominoes) {
            int a = domino[0];
            int b = domino[1];
            int key = a < b ? a * 10 + b : b * 10 + a;

            count += map[key]; 
            map[key]++;      
        }

        return count;
    }
}