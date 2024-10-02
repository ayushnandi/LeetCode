class Solution {
    public int[] arrayRankTransform(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> map1 = new HashMap<>();
        for(int i = 0 ; i < arr.length ; i++ ){
            if(map1.containsKey(arr[i])){
                continue;
            }
            else{
                map1.put(arr[i],1);
                list.add(arr[i]);
            }
        }
        // if(arr[arr.length-1]!=arr[arr.length-2]){
        //     list.add(arr[arr.length-1]);
        // }
        // if(list.isEmpty()){
        //     list.add(arr[0]);
        // }
        for(int i : list){
            System.out.print(i+" ");
        }
        Collections.sort(list);
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < list.size() ; i++ ){
            map.put(list.get(i),i+1);
        }
        for(int i = 0 ; i < arr.length ; i++ ){
            arr[i] = map.get(arr[i]);
        }
        return arr;
    }
}