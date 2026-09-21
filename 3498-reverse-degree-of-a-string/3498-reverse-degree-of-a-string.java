class Solution {
    public int reverseDegree(String s) {
        int product = 0 ;
        int arr [] = new int [s.length()];
        for(int i = 0 ; i < s.length() ; i++ ){
            int ri = 26 -(s.charAt(i)-97);
            product += (ri * (i+1));
            // System.out.println(product);
        }
        return product;
    }
}