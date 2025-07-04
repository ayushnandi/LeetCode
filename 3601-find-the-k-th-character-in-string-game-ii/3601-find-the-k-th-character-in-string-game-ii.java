class Solution {
    public char kthCharacter(long k, int[] nums){
        if( k == 1 ){
            return 'a';
        }
        int n = nums.length;
        int opp = nums[0];
        long  newk = -1;
        long  len = 1;
        for(int i = 0 ; i < n ; i++ ){
            len *= 2;
            if( len >= k ){
                opp = nums[i];
                newk = k - len/2;
                break;
            }
        }
        char ch = kthCharacter(newk,nums);
        if(opp==0){
            return ch;
        }
        else{
            return ch == 'z' ? 'a' : (char)(ch+1) ;
        }
    }
}