class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        if(s.length()!= t.length())return false;
        for(int i = 0 ; i < s.length() ; i++ ){
            map1.put(s.charAt(i), map1.getOrDefault(s.charAt(i),0)+1);
            map2.put(t.charAt(i), map2.getOrDefault(t.charAt(i),0)+1);
        }
        // ArrayList<Character> arr1 = new ArrayList<>(map1.keySet());
        // ArrayList<Character> arr2 = new ArrayList<>(map2.keySet());
        // arr1.sort((a,b) -> (map1.get(b)-map1.get(a));
        // arr2.sort((a,b) -> (map2.get(b)-map2.get(a));
        // for(int i = 0 ; i < arr1.size() ; i++ ){
        //     if(arr1.get())
        return map1.equals(map2);
    }
}