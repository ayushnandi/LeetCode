class Solution {
    public List<String> stringMatching(String[] arr) {
        int n = arr.length ;
        ArrayList<String> list = new ArrayList<>();
        HashMap<String,Integer> map = new HashMap<>();
        for(int i = 0 ; i < n ; i++ ){
            for(int j = 0 ; j < n ; j++ ){
                if(i!=j){
                    if(arr[j].contains(arr[i]) && !map.containsKey(arr[i])){
                        list.add(arr[i]);
                        map.put(arr[i],1);
                    }
                }
            }
        }
        return list;
    }
}