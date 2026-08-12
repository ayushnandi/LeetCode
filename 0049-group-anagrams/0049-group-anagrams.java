class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        String [] str =  new String[strs.length];
        HashMap<String , List<String>> map = new HashMap<>();
        int j = 0;
        for(String i : strs){
            char [] s = i.toCharArray();
            Arrays.sort(s);
            String newString = new String(s);
            if(!map.containsKey(newString)){
               map.put(newString,new ArrayList<>()); 
            }
            map.get(newString).add(i);
        }
        return new ArrayList<>(map.values());
    }
}