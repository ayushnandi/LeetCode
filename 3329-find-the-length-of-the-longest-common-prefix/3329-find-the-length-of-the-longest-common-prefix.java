class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        TrieNode root = new TrieNode();
        
        for(int n: arr1){
            insert(Integer.toString(n), root);
        }

        int res = 0;

        for(int no : arr2){
            String str = Integer.toString(no);
            int len = 0;
            TrieNode crr = root;
            for(char c: str.toCharArray()){
                int idx = c - '0';
                if(crr.children[idx] == null){
                    break;
                }
                crr = crr.children[idx];
                len += 1;
            }
            res = Math.max(res, len);
        }

        return res;
    }
    public void insert(String word, TrieNode root) {
        TrieNode crr = root;

        for(char c: word.toCharArray()){
            int idx = c - '0';
            if(crr.children[idx] == null){
                crr.children[idx] = new TrieNode();
            }
            crr = crr.children[idx];
        }

        crr.isEnd = true;
    }
}

class TrieNode{
    TrieNode[] children;
    boolean isEnd;

    public TrieNode(){
        children = new TrieNode[10];
        isEnd = false;
    }
}