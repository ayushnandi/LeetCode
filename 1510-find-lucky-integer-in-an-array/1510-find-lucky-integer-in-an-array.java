class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i : arr ){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        int max = Integer.MIN_VALUE;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if( entry.getValue()== entry.getKey()) max = Math.max(max , entry.getValue());
        }
        return max==Integer.MIN_VALUE ? -1 : max ;
    }
}