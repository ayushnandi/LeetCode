class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int max=  0;

        for(int i =0 ; i < s.length() ; i++ ){
            HashMap<Character,Integer> map = new HashMap<>();
            int cnt = 0 ;
            for(int j = i ; j < s.length() ; j++ ){
                if(map.containsKey(s.charAt(j))){
                    break;
                }else{
                    // System.out.print(s.charAt(j)) ;
                    cnt++;
                    map.put(s.charAt(j),1);
                    max = Math.max(max, cnt);
                }
            }
            // System.out.println();
            // System.out.println(max);
        }
        return max;
    }
}