class Solution {
    public int maximumCount(int[] nums) {
        int cntP = 0;
        int cntN = 0;
        for(int i : nums){
            if(i>0) cntP++;
            else if(i!=0) cntN++;
        }
        return Math.max(cntN,cntP);
    }
}