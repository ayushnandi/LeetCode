class Solution {
    public int findPermutationDifference(String s, String t) {
	int n = s.length();
	int res = 0;
	for(int i=0; i<n; i++){ 
		char ch = s.charAt(i);
		int j=0;
		while(j<n && t.charAt(j) != ch) j++;
		res += Math.abs(i-j);
	}
	return res;
}
}