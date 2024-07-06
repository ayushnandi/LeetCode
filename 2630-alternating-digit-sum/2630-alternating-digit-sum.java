class Solution {
    public int alternateDigitSum(int n) {
        int sum = 0 ;
        String s = Integer.toString(n);
        int i = 0;
        if(s.length()%2!=0){
            while(n!=0){
                int r= n%10;
                n = n/10;
                System.out.print(r+" ");
                if(i++%2==0){
                    sum += r;
                }
                else{
                    sum -= r;
                }
            }
        }
        else{
            while(n!=0){
                int r= n%10;
                n = n/10;
                System.out.print(r+" ");
                if(i++%2!=0){
                    sum += r;
                }
                else{
                    sum -= r;
                }
            }
        }
        return sum;
    }
}