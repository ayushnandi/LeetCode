class Solution {
    public int[] frequencySort(int [] nums) {
        HashMap <Integer, Integer> map  = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++ ){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int [] arr = new int [nums.length];
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> map.get(a)!=map.get(b) ? map.get(a) - map.get(b) : b-a);
        pq.addAll(map.keySet());
        int i=0;
        while( i < nums.length){
            int val = pq.poll();
            int freq = map.get(val);
            while(freq > 0){
                nums[i++] = val;
                freq--;
            }
        }
        return nums;
    }
}