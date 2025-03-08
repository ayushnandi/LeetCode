class Solution {
    public int minimumRecolors(String blocks, int k) {
        int count= 0 ;
        for(int i = 0 ; i < k; i++ ){
            if(blocks.charAt(i)=='B')count++;
        }
        int min = Math.min(k-count,k);
        for(int i = 0 , j = k ; j < blocks.length() ; i++ ,j++){
            count += (blocks.charAt(i) == blocks.charAt(j)) ? 0 : (blocks.charAt(i) == 'B' && blocks.charAt(j) == 'W') ? -1 : 1;
            min = Math.min(k-count,min);
        }
        return min;
    }
}