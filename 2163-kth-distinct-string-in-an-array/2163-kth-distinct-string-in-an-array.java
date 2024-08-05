class Solution {
    public String kthDistinct(String[] arr, int k) {
        HashMap<String,Integer> map = new HashMap<>();
        for(int i = 0 ; i < arr.length ; i++ ){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        ArrayList<String> arr1 = new ArrayList<>();
        for(int i = 0 ; i < arr.length ; i++ ){
            if(map.get(arr[i])==1){
                arr1.add(arr[i]);
                // System.out.println(arr[i]);
            }
        }
        return arr1.size()>=k ? arr1.get(k-1) : "" ;
    }
}