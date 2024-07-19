class Solution {
    public int findMinDifference(List<String> arr) {
        int [] time = new int [arr.size()];
        int hr = 0;
        int min  = 0;
        int totalmin = 0 ;
        for(int i = 0 ; i < arr.size() ; i++ ){
            String s = arr.get(i);
            String hrs = ""+s.charAt(0) + s.charAt(1);
            String mins = ""+s.charAt(3) + s.charAt(4);
            hr = Integer.parseInt(hrs);
            min = Integer.parseInt(mins);
            totalmin  = hr*60 + min;
            System.out.println(hr+" "+min+" > "+totalmin);
            time[i] = totalmin;
        } 
        Arrays.sort(time);
         int c=time[arr.size()-1]-time[0];
        if(c>720)
            c=1440-c;
        for(int i=0;i<arr.size()-1;i++){
            int b= time[i+1]-time[i];
            if(b>720)b=1440-b;
            if(b<c)c=b;
               }
        return c;
    }
}