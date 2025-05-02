class Solution {
    public String pushDominoes(String s) {
        int n = s.length();
        int [] LeftP = new int [n];
        int [] RightP = new int [n];
        for(int i = 0 ; i < n ; i++ ){
            if(s.charAt(i)=='R'){
                RightP[i] = i;
            }
            else{
                RightP[i] = -1;
            }
            if(s.charAt(n-i-1)=='L'){
                LeftP[n-i-1] = n-i-1;
            }
            else{
                LeftP[n-i-1] = -1;
            }
            if(s.charAt(i)=='.'){
                if(i==0) RightP[i] = -1;
                else RightP[i] = RightP[i-1];
                // System.out.print(RightP[i]+" "+i);
            }

            if(s.charAt(n-i-1)=='.'){
                if(n-i-1 == n-1) LeftP[n-i-1] = -1;
                else LeftP[n-i-1 ] = LeftP[n-i];
                // System.out.println(LeftP[n-i-1 ]);
            }
            // System.out.print( RightP[i]+" " );
        }
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) != '.') {
                ans.append(s.charAt(i));
                continue;
            }

            int leftDist = LeftP[i] == -1 ? Integer.MAX_VALUE : Math.abs(LeftP[i] - i);
            int rightDist = RightP[i] == -1 ? Integer.MAX_VALUE : Math.abs(RightP[i] - i);
            if(LeftP[i] ==-1 && RightP[i]==-1){
                ans.append('.');
            }
            else if (leftDist == rightDist) {
                ans.append('.');
            } else if (leftDist < rightDist) {
                ans.append('L');
            } else {
                ans.append('R');
            }
        }

        return ans.toString();
    }
}