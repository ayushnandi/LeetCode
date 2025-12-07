class Solution {
    public int minProcessingTime(List<Integer> pt, List<Integer> tasks) {
        Collections.sort(tasks);
        Collections.sort(pt);
        int max = 0;
        int n = tasks.size();
        for(int i= n-1, j = 0 ; i >= 0 ; i=i-4, j++ ){
            max = Math.max(tasks.get(i)+pt.get(j),max);
        }
        return max;
    }
}