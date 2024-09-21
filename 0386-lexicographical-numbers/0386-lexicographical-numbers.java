class Solution {
    public List<Integer> lexicalOrder(int n) {
        String [] arr = new String [n];
        List<Integer> list = new ArrayList<>();
        for(int i = 1 ; i <= n ; i++ ){
            arr[i-1] = Integer.toString(i);
        }
        Arrays.sort(arr);
        for(String i : arr){
            list.add(Integer.parseInt(i));
        }
        return list;
    }
}