import java.util.Map; 
class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        HashMap <Integer,Integer> map =  new HashMap<>();
        for(int i : nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue()>=2){
                arr.add(entry.getKey());
            }
        }
        // for(int i : nums){
        //     if(map.get(i)>=2){
        //         arr.add(i);
        //     }
        // }
        int n = 0 ;
        int [] array = new int [arr.size()];
        for(int i : arr){
            array[n++] = i;
        }
        return array;
    }
}