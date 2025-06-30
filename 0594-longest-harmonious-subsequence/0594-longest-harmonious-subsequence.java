class Solution {
    public int findLHS(int[] nums) {
        HashMap<Integer,Integer> map  = new HashMap<>();
        for(int i : nums){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        int n = 0 ;
        if(map.size()==1)return 0;
        for(int i : nums){
            if(map.containsKey(i+1)){
                n = Math.max(n,map.get(i)+map.get(i+1));
            }
        }
        return n;
    }
}