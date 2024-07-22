import java.util.*;

class Solution {
    public String[] sortPeople(String[] n, int[] h) {
        // Use a TreeMap with a custom comparator to sort by height in descending order
        SortedMap<Integer, String> map = new TreeMap<>(Collections.reverseOrder()); 
        for(int i = 0 ; i < n.length ; i++ ){
            map.put(h[i], n[i]);
        }
        
        int i = 0;
        for (String name : map.values()) { 
            n[i++] = name;
        } 
        return n;
    }
}
