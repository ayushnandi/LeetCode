class Solution {
    public List<List<Integer>> threeSum(int[] arr) {

			if(arr==null || arr.length<3){
	        return new ArrayList<>();
				}
		Arrays.sort(arr);
		HashSet<List<Integer>> hs = new HashSet<List<Integer>>();
		
		for(int i=0;i<arr.length-2;i++) {
			int left = i+1;
			int right = arr.length-1;
			
			while(left<right) {
			if(arr[i]+arr[left]+arr[right]==0) {
				hs.add(Arrays.asList(arr[i],arr[left],arr[right])) ;
				left++;
				right--;
			}else if(arr[i]+arr[left]+arr[right]<0) {
				left++;
			}else {
				right--;
			}
		}
		}
		return new ArrayList<>(hs);
}
}