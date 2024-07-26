class Solution {
    public int finalValueAfterOperations(String[] arr) {
        int count = 0; 
        for(String i : arr){
            if(i.equals("X++")||i.equals("++X"))count+=1;
            else count-=1;
        }
        return count;
    }
}