class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int feed = 0;
        Arrays.sort(s);
        Arrays.sort(g);
        for(int i = 0 ,j = 0; i < g.length && j < s.length ;  ){
            if(s[j]>=g[i]){
                i++;
                j++;
                feed++;
            }
            else if(s[j]<g[i]){
                j++;
            }
        }
        return feed;
    }
}