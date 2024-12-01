class Solution {
    public boolean checkIfExist(int[] arr) {
        int j = 0 ; HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : arr)map.put(i,j++);
        for(int i = 0 ; i < arr.length ; i++ )if(map.containsKey(2*arr[i])&& map.get(2*arr[i])!=i) return true;
        return false;
    }
}