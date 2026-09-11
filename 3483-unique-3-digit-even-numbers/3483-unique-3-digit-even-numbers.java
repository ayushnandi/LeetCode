class Solution {
    public int totalNumbers(int[] nums) {
        int freq [] = new int [10];
        int cnt = 0;
        for(int i : nums)freq[i]++;
        for(int i = 1 ; i < 10 ; i++ ){
            if(freq[i]==0)continue;
            freq[i]--;
            for(int j = 0 ; j < 10 ; j++ ){
                if(freq[j]==0)continue;
                freq[j]--;
                for(int k = 0 ; k <= 8 ; k+=2 ){
                    if(freq[k]>0)cnt++;
                }
                freq[j]++;
            }
            freq[i]++;
        }
        return cnt;
    }
}