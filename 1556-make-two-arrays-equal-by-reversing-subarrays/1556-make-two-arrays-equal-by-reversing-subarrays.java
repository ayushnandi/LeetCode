class Solution {
    public boolean canBeEqual(int[] arr1, int[] arr2) {
        if(arr1.length!=arr2.length)return false;
        HashMap <Integer, Integer> map1 = new HashMap<>();
        HashMap <Integer, Integer> map2 = new HashMap<>(); 
        for(int i = 0 ; i < arr1.length ; i++ ){
            map1.put(arr1[i],map1.getOrDefault(arr1[i],0)+1);
            map2.put(arr2[i],map2.getOrDefault(arr2[i],0)+1);
        }
        return map1.equals(map2);
    }
}