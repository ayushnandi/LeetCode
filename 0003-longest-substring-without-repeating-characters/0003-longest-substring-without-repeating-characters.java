class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 1;
        int cnt = 0;
        // String ans = "";
        if(s.isEmpty())return 0;
        for(int i = 0 ; i < s.length() ; i++ ){
            HashMap<Character, Integer> map = new HashMap<>();
            for(int j = i ; j < s.length() ; j++ ){
                if(map.containsKey(s.charAt(j)) ){
                    max = Math.max(cnt,max);
                    // System.out.println(s.substring(i,j));
                    
                    break;
                }
                else{
                    map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);
                    cnt++;
                }
            }
            max = Math.max(cnt,max);
            cnt=0;
            // map.put(s.charAt(i),map.get(s.charAt(i)-1));
        }
        return max;
    }
}