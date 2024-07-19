class Solution {
    public List<Integer> luckyNumbers (int[][] arr) {
        int [] dpCol = new int [arr[0].length];
        Arrays.fill(dpCol,-1);
        ArrayList<Integer> list = new ArrayList<>();
        int min = 999999;
        int index = 0;
        for(int i = 0 ; i < arr.length ; i++ ){
            min = 999999;
            for(int j = 0 ; j < arr[0].length; j++ ){
                if(arr[i][j]<min){
                    min = arr[i][j];
                    index = j;
                }
            }
            if(dpCol[index]==-1){
                dpCol[index]=Vmax(arr,index);
            }
            if(dpCol[index]==min){
                list.add(min);
                return list;
            } 
        }
        return list;
    }
    public int Vmax(int [][] arr, int n){
        int max = 0;
        for(int i = 0 ; i < arr.length; i++ ){
            max = Math.max(max, arr[i][n]);
        }
        return max;
    }
}



// class Solution {
//     public List<Integer> luckyNumbers (int[][] arr) {
//         int max = 0;
//         int [] row = new int [arr[0].length];
//         int [] col = new int [arr.length];
//         ArrayList<Integer> list = new ArrayList<>();
//         HashMap<Integer, Integer> map = new HashMap<>(); 
//         for(int i = 0 ; i < arr.length ; i++ ){
//            col[i] = Rmin(arr,i);
//            map.put(col[i],map.getOrDefault(col[i],0)+1);
//         }
//         for(int i = 0 ; i < arr[0].length ; i++ ){
//             row[i] = Vmax(arr,i);
//             if(map.containsKey(row[i])){
//                 list.add(row[i]);
//                 return list;
//             }
//         }
//         return list;
//     }
//     public int Vmax(int [][] arr, int n){
//         int max = 0;
//         for(int i = 0 ; i < arr.length; i++ ){
//             max = Math.max(max, arr[i][n]);
//         }
//         return max;
//     }
//     public int Rmin(int [][] arr, int n){
//         int min = 999999;
//         for(int i = 0 ; i < arr[0].length; i++ ){
//             min = Math.min(min, arr[n][i]);
//         }
//         return min;
//     }
// }