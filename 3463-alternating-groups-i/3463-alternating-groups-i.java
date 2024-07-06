class Solution {
    public int numberOfAlternatingGroups(int[] arr) {
        if(arr.length<3)return 0;
        int count = 0 ; 
        for(int i = 1 ; i < arr.length-1 ; i++ ){
            if(arr[i-1]!=arr[i]&&arr[i+1]!=arr[i]){
                count++;
            }          
        }
        if(arr[0]!=arr[arr.length-1]&&arr[arr.length-2]!=arr[arr.length-1])count++;
        if(arr[0]!=arr[1]&&arr[0]!=arr[arr.length-1])count++;
        return count;
    }
}