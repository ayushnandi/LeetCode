class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : nums1){
            map.put(i, map.getOrDefault(i , 0)+1);
        }
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0 ; i < nums2.length ; i++ ){
           if(map.containsKey(nums2[i]) && map.get(nums2[i])>0){
               map.put(nums2[i],map.get(nums2[i])-1);
               arr.add(nums2[i]);
           }
        }
        int [] a = new int [arr.size()];
        for(int i = 0 ; i < arr.size() ; i++ ){
            a[i] = arr.get(i);
        }
        return a;
    }
}