class Solution {
    public double averageWaitingTime(int[][] cust) {
        int ft = cust[0][0];
        double wt = 0;
        for(int i=0;i<cust.length;i++){
            int x = cust[i][0];
            int y = cust[i][1];
            if(x > ft){
                ft = x + y;
                wt += ft - x;
            }
            else{
                ft += y;
                wt += (ft - x);
            }
            
            //System.out.println(ft + " " + wt);
        }
        double res = wt / cust.length;
        return res;
    }
}