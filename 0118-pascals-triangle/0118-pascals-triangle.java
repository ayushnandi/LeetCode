class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        if(n==0) return ans;
        list.add(1);
        ans.add(list);
        for(int i = 1 ; i < n ; i++ ){
            List<Integer> list1 = new ArrayList<>();
            list1.add(1);
            for(int j = 1 ; j < i ; j++ ){
                list1.add(list.get(j)+list.get(j-1));
            }
            list1.add(1);
            ans.add(list1);
            list = list1;
        }
        return ans;
    }
}