class Solution {
    // public int findCenter(int[][] arr) {
    //     HashMap<Integer, Integer> map = new HashMap<>();
    //     int max = 0;
    //     int val = 0;
    //     for(int i = 0 ; i < arr.length ; i++ ){
    //         for(int j = 0 ; j < arr[0].length ; j++ ){
    //             map.put(arr[i][j], map.getOrDefault(arr[i][j],0)+1);
    //             if(max<map.get(arr[i][j])){
    //                 max = map.get(arr[i][j]);
    //                 val = arr[i][j];
    //             }
    //         }
    //     }
    //     return val;
    // }

    public int findCenter(int[][] edges) {
        int a = edges[0][0];
        int b = edges[0][1];

        if(a == edges[1][0] || a == edges[1][1]) 
            return a;
        else 
            return b;
    }

}