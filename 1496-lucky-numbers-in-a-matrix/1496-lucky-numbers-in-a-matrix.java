class Solution {
    public List<Integer> luckyNumbers (int[][] arr) {
        int max = 0;
        int [] row = new int [arr[0].length];
        int [] col = new int [arr.length];
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>(); 
        for(int i = 0 ; i < arr.length ; i++ ){
           col[i] = Rmin(arr,i);
           System.out.println(col[i]);
           map.put(col[i],map.getOrDefault(col[i],0)+1);
        }
        for(int i = 0 ; i < arr[0].length ; i++ ){
            row[i] = Vmax(arr,i);
            System.out.println(row[i]);
            if(map.containsKey(row[i])){
                list.add(row[i]);
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
    public int Rmin(int [][] arr, int n){
        int min = 999999;
        for(int i = 0 ; i < arr[0].length; i++ ){
            min = Math.min(min, arr[n][i]);
        }
        return min;
    }
}